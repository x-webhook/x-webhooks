package xwebhook_test

import (
	"context"
	"log"
	"net/url"
	"testing"

	xwebhook "github.com/x-webhook/x-webhooks/go"
	"github.com/x-webhook/x-webhooks/go/internal/openapi"
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
	var err error
	ctx := context.Background()
	// new xwebhook
	token := "apikeysec_02859f3d7a785bcfb24a0371a0db024154a5"
	opts := &xwebhook.XwebhookOptions{
		Debug: true,
		ServerUrl: &url.URL{
			Scheme: "http",
			Host:   "localhost:8181",
		},
	}
	xwh = xwebhook.New(token, opts)

	// create event type
	evt, err := xwh.EventType.Create(ctx, openapi.NewEventTypeIn("my first event type", "mew.created"))
	if err != nil {
		log.Panicf("create evt failed, err %v", err)
	}
	eventTypeName = evt.Name

	// create application
	app, err := xwh.Application.Create(ctx, openapi.NewApplicationIn("myapp"))
	if err != nil {
		log.Panicf("create app failed, err %v", err)
	}
	appId = app.Id

	// create endpoint
	epIn := openapi.NewEndpointIn("http://localhost:20811")
	epIn.SetFilterTypes([]string{eventTypeName})
	ep, err := xwh.Endpoint.Create(ctx, appId, epIn)
	if err != nil {
		log.Panicf("create ep failed, err %v", err)
	}
	endpointId = ep.Id

	// // create message
	// msg, err := xwh.Message.Create(ctx, appId, openapi.NewMessageIn(eventTypeName, map[string]any{"hello": "world"}))
	// if err != nil {
	// 	log.Panicf("create msg failed, err %v", err)
	// }
	// messageId = msg.Id
}

func teardown() {
	ctx := context.Background()

	err := xwh.Application.Delete(ctx, appId)
	if err != nil {
		log.Printf("delete app failed, err %v", err)
	}

	err = xwh.EventType.Delete(ctx, eventTypeName)
	if err != nil {
		log.Printf("delete evt failed, err %v", err)
	}

	err = xwh.Endpoint.Delete(ctx, appId, endpointId)
	if err != nil {
		log.Printf("delete endpoint failed, err %v", err)
	}
}
