package xwebhook_test

import (
	"context"
	"log"
	"net/url"
	"testing"

	xwebhook "github.com/x-webhook/x-webhooks/go"
)

var (
	xwh *xwebhook.Xwebhook

	appId         = ""
	eventTypeName = ""
	endpointId    = ""
	messageId     = ""
	attemptId     = ""
)

func TestMain(m *testing.M) {
	defer teardown()

	setup()

	m.Run()
}

func setup() {
	// new xwebhook
	token := "YOUR_APIKEY_TOKEN"
	opts := &xwebhook.XwebhookOptions{
		Debug: true,
		// ServerUrl: &url.URL{
		// 	Scheme: "http",
		// 	Host:   "localhost:8181",
		// },
		ServerUrl: &url.URL{
			Scheme: "https",
			Host:   "api.webhook.openweb3.io",
		},
	}
	xwh = xwebhook.New(token, opts)
}

func TestLogic(t *testing.T) {
	ctx := context.Background()

	// create event type
	eventIn := &xwebhook.EventTypeIn{}
	eventIn.SetName("mew.updated")
	evt, err := xwh.EventType.Create(ctx, eventIn)
	if err != nil {
		log.Panicf("create evt failed, err %v, evt %+v", err.Error(), evt)
	}
	eventTypeName = evt.Name

	// create application
	appIn := &xwebhook.ApplicationIn{}
	appIn.SetName("myapp0")
	app, err := xwh.Application.Create(ctx, appIn)
	if err != nil {
		log.Panicf("create app failed, err %v", err)
	}
	appId = app.Id

	appPatch := &xwebhook.ApplicationPatch{}
	appPatch.SetUid("unique-app-identifier0")
	appPatch.SetName("myapp_modified0")
	appUpdated, err := xwh.Application.Patch(ctx, appId, appPatch)
	if err != nil {
		log.Panicf("patch app failed, err %v", err)
	}
	log.Printf("appUpdated: %+v", appUpdated)

	// create endpoint
	epIn := &xwebhook.EndpointIn{}
	epIn.SetUrl("http://localhost:28111/webhook")
	epIn.SetFilterTypes([]string{eventTypeName})
	ep, err := xwh.Endpoint.Create(ctx, appId, epIn)
	if err != nil {
		log.Panicf("create ep failed, err %v", err)
	}
	endpointId = ep.Id

	// create message
	msgIn := &xwebhook.MessageIn{}
	msgIn.SetEventType(eventTypeName)
	msgIn.SetPayload(map[string]any{"hello": "world"})
	msg, err := xwh.Message.Create(ctx, appId, msgIn)
	if err != nil {
		log.Panicf("create msg failed, err %v", err)
	}
	messageId = msg.Id

	log.Printf("create message succ, message %+v", msg)
}

func teardown() {
	ctx := context.Background()

	err := xwh.Endpoint.Delete(ctx, appId, endpointId)
	if err != nil {
		log.Printf("delete endpoint failed, err %v", err)
	}

	err = xwh.EventType.Delete(ctx, eventTypeName)
	if err != nil {
		log.Printf("delete evt failed, err %v", err)
	}

	err = xwh.Application.Delete(ctx, appId)
	if err != nil {
		log.Printf("delete app failed, err %v", err)
	}
}
