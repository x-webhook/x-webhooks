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
import io.openweb3.xwebhook.models.ListResponseEndpointMessageOut;
import io.openweb3.xwebhook.models.ListResponseMessageAttemptEndpointOut;
import io.openweb3.xwebhook.models.ListResponseMessageAttemptOut;
import io.openweb3.xwebhook.models.ListResponseMessageEndpointOut;
import io.openweb3.xwebhook.models.MessageAttemptHeadersOut;
import io.openweb3.xwebhook.models.MessageAttemptOut;
import io.openweb3.xwebhook.models.MessageStatus;
import java.time.OffsetDateTime;
import java.util.Set;
import io.openweb3.xwebhook.models.StatusCodeClass;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessageAttemptApi
 */
@Ignore
public class MessageAttemptApiTest {

    private final MessageAttemptApi api = new MessageAttemptApi();

    
    /**
     * Delete attempt response body
     *
     * Deletes the given attempt&#39;s response body. Useful when an endpoint accidentally returned sensitive content.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageAttemptExpungeContentTest() throws ApiException {
        String appId = null;
        String msgId = null;
        String attemptId = null;
        api.v1MessageAttemptExpungeContent(appId, msgId, attemptId);

        // TODO: test validations
    }
    
    /**
     * Get Attempt
     *
     * &#x60;msg_id&#x60;: Use a message id or a message &#x60;eventId&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageAttemptGetTest() throws ApiException {
        String appId = null;
        String msgId = null;
        String attemptId = null;
        MessageAttemptOut response = api.v1MessageAttemptGet(appId, msgId, attemptId);

        // TODO: test validations
    }
    
    /**
     * Get Attempt Headers
     *
     * Calculate and return headers used on a given message attempt
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageAttemptGetHeadersTest() throws ApiException {
        String appId = null;
        String msgId = null;
        String attemptId = null;
        MessageAttemptHeadersOut response = api.v1MessageAttemptGetHeaders(appId, msgId, attemptId);

        // TODO: test validations
    }
    
    /**
     * List Attempted Destinations
     *
     * List endpoints attempted by a given message. Additionally includes metadata about the latest message attempt. By default, endpoints are listed in ascending order by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageAttemptListAttemptedDestinationsTest() throws ApiException {
        String appId = null;
        String msgId = null;
        Integer limit = null;
        String iterator = null;
        ListResponseMessageEndpointOut response = api.v1MessageAttemptListAttemptedDestinations(appId, msgId, limit, iterator);

        // TODO: test validations
    }
    
    /**
     * List Attempted Messages
     *
     * List messages for a particular endpoint. Additionally includes metadata about the latest message attempt.  The &#x60;before&#x60; parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageAttemptListAttemptedMessagesTest() throws ApiException {
        String appId = null;
        String endpointId = null;
        Integer limit = null;
        String iterator = null;
        String channel = null;
        String tag = null;
        MessageStatus status = null;
        OffsetDateTime before = null;
        OffsetDateTime after = null;
        Boolean withContent = null;
        Set<String> eventTypes = null;
        ListResponseEndpointMessageOut response = api.v1MessageAttemptListAttemptedMessages(appId, endpointId, limit, iterator, channel, tag, status, before, after, withContent, eventTypes);

        // TODO: test validations
    }
    
    /**
     * List Attempts By Endpoint
     *
     * List attempts by endpoint id  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageAttemptListByEndpointTest() throws ApiException {
        String appId = null;
        String endpointId = null;
        Integer limit = null;
        String iterator = null;
        MessageStatus status = null;
        StatusCodeClass statusCodeClass = null;
        String channel = null;
        String tag = null;
        OffsetDateTime before = null;
        OffsetDateTime after = null;
        Boolean withContent = null;
        Boolean withMsg = null;
        Set<String> eventTypes = null;
        ListResponseMessageAttemptOut response = api.v1MessageAttemptListByEndpoint(appId, endpointId, limit, iterator, status, statusCodeClass, channel, tag, before, after, withContent, withMsg, eventTypes);

        // TODO: test validations
    }
    
    /**
     * List Attempts For Endpoint
     *
     * DEPRECATED: please use list_attempts with endpoint_id as a query parameter instead.  List the message attempts for a particular endpoint.  Returning the endpoint.  The &#x60;before&#x60; parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageAttemptListByEndpointDeprecatedTest() throws ApiException {
        String appId = null;
        String msgId = null;
        String endpointId = null;
        Integer limit = null;
        String iterator = null;
        String channel = null;
        String tag = null;
        MessageStatus status = null;
        OffsetDateTime before = null;
        OffsetDateTime after = null;
        Set<String> eventTypes = null;
        ListResponseMessageAttemptEndpointOut response = api.v1MessageAttemptListByEndpointDeprecated(appId, msgId, endpointId, limit, iterator, channel, tag, status, before, after, eventTypes);

        // TODO: test validations
    }
    
    /**
     * List Attempts By Msg
     *
     * List attempts by message id  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageAttemptListByMsgTest() throws ApiException {
        String appId = null;
        String msgId = null;
        Integer limit = null;
        String iterator = null;
        MessageStatus status = null;
        StatusCodeClass statusCodeClass = null;
        String channel = null;
        String tag = null;
        String endpointId = null;
        OffsetDateTime before = null;
        OffsetDateTime after = null;
        Boolean withContent = null;
        Set<String> eventTypes = null;
        ListResponseMessageAttemptOut response = api.v1MessageAttemptListByMsg(appId, msgId, limit, iterator, status, statusCodeClass, channel, tag, endpointId, before, after, withContent, eventTypes);

        // TODO: test validations
    }
    
    /**
     * List Attempts
     *
     * Deprecated: Please use \&quot;List Attempts by Endpoint\&quot; and \&quot;List Attempts by Msg\&quot; instead.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate.  &#x60;msg_id&#x60;: Use a message id or a message &#x60;eventId&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageAttemptListByMsgDeprecatedTest() throws ApiException {
        String appId = null;
        String msgId = null;
        Integer limit = null;
        String iterator = null;
        String endpointId = null;
        String channel = null;
        String tag = null;
        MessageStatus status = null;
        OffsetDateTime before = null;
        OffsetDateTime after = null;
        StatusCodeClass statusCodeClass = null;
        Set<String> eventTypes = null;
        ListResponseMessageAttemptOut response = api.v1MessageAttemptListByMsgDeprecated(appId, msgId, limit, iterator, endpointId, channel, tag, status, before, after, statusCodeClass, eventTypes);

        // TODO: test validations
    }
    
    /**
     * Resend Webhook
     *
     * Resend a message to the specified endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageAttemptResendTest() throws ApiException {
        String appId = null;
        String msgId = null;
        String endpointId = null;
        String idempotencyKey = null;
        api.v1MessageAttemptResend(appId, msgId, endpointId, idempotencyKey);

        // TODO: test validations
    }
    
}
