package xwebhook

import (
	"fmt"
	"net/http"
	"net/url"
	"strings"
	"time"

	"github.com/x-webhook/x-webhooks/go/internal/openapi"
	"github.com/x-webhook/x-webhooks/go/internal/version"
)

type (
	XwebhookOptions struct {
		Debug bool

		// Overrides the base URL (protocol + hostname) used for all requests sent by this Xwebhook client. (Useful for testing)
		ServerUrl  *url.URL
		HTTPClient *http.Client
	}
	Xwebhook struct {
		Authentication *Authentication
		Application    *Application
		Endpoint       *Endpoint
		EventType      *EventType
		Integration    *Integration
		Message        *Message
		MessageAttempt *MessageAttempt
		Statistics     *Statistics
	}
)

var defaultHTTPClient = &http.Client{
	Timeout: 60 * time.Second,
}

func String(s string) *string {
	return &s
}
func NullableString(s *string) *openapi.NullableString {
	return openapi.NewNullableString(s)
}
func NullableInt32(num *int32) *openapi.NullableInt32 {
	return openapi.NewNullableInt32(num)
}
func Int32(i int32) *int32 {
	return &i
}
func NullableBool(b *bool) *openapi.NullableBool {
	return openapi.NewNullableBool(b)
}

func New(token string, options *XwebhookOptions) *Xwebhook {
	conf := openapi.NewConfiguration()
	conf.Scheme = "https"
	conf.Host = "api.xwebhook.com"
	conf.HTTPClient = defaultHTTPClient

	var tokenParts = strings.Split(token, ".")
	var region = tokenParts[len(tokenParts)-1]
	if region == "us" {
		conf.Host = "api.us.xwebhook.com"
	} else if region == "eu" {
		conf.Host = "api.eu.xwebhook.com"
	} else if region == "in" {
		conf.Host = "api.in.xwebhook.com"
	}

	if options != nil {
		conf.Debug = options.Debug
		if options.ServerUrl != nil {
			conf.Scheme = options.ServerUrl.Scheme
			conf.Host = options.ServerUrl.Host
		}
		if options.HTTPClient != nil {
			conf.HTTPClient = options.HTTPClient
		}
	}
	conf.AddDefaultHeader("Authorization", fmt.Sprintf("Bearer %s", token))
	conf.UserAgent = fmt.Sprintf("xwebhook-libs/%s/go", version.Version)
	apiClient := openapi.NewAPIClient(conf)
	return &Xwebhook{
		Authentication: &Authentication{
			api: apiClient,
		},
		Application: &Application{
			api: apiClient,
		},
		Endpoint: &Endpoint{
			api: apiClient,
		},
		EventType: &EventType{
			api: apiClient,
		},
		Message: &Message{
			api: apiClient,
		},
		Integration: &Integration{
			api: apiClient,
		},
		MessageAttempt: &MessageAttempt{
			api: apiClient,
		},
		Statistics: &Statistics{
			api: apiClient,
		},
	}
}
