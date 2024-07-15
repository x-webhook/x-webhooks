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
import io.openweb3.xwebhook.models.MessageStreamOut;
import java.time.OffsetDateTime;
import java.util.Set;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
@Ignore
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    
    /**
     * Events
     *
     * Reads the stream of operational webhook events for this environment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1EventsTest() throws ApiException {
        Integer limit = null;
        String iterator = null;
        Set<String> eventTypes = null;
        Set<String> channels = null;
        OffsetDateTime after = null;
        MessageStreamOut response = api.v1Events(limit, iterator, eventTypes, channels, after);

        // TODO: test validations
    }
    
}
