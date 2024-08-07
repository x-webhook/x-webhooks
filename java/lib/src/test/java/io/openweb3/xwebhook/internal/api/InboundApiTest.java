/*
 * Xwebhook API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openweb3.xwebhook.internal.api;

import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.models.HTTPValidationError;
import io.openweb3.xwebhook.models.HttpErrorOut;
import io.openweb3.xwebhook.models.MessageOut;
import io.openweb3.xwebhook.models.RotatedUrlOut;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InboundApi
 */
@Ignore
public class InboundApiTest {

    private final InboundApi api = new InboundApi();

    
    /**
     * Handle Inbound
     *
     * Handles a raw inbound webhook for the application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1InboundMsgTest() throws ApiException {
        String appId = null;
        String inboundToken = null;
        String body = null;
        String eventType = null;
        String idempotencyKey = null;
        MessageOut response = api.v1InboundMsg(appId, inboundToken, body, eventType, idempotencyKey);

        // TODO: test validations
    }
    
    /**
     * Rotate Url
     *
     * Invalidates the previous inbound url (if one exists), producing a new inbound URL for this app
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1InboundRotateUrlTest() throws ApiException {
        String appId = null;
        String idempotencyKey = null;
        RotatedUrlOut response = api.v1InboundRotateUrl(appId, idempotencyKey);

        // TODO: test validations
    }
    
}
