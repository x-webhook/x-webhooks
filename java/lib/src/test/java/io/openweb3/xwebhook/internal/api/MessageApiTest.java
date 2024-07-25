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
import io.openweb3.xwebhook.models.ListResponseMessageOut;
import io.openweb3.xwebhook.models.MessageAttemptOut;
import io.openweb3.xwebhook.models.MessageIn;
import io.openweb3.xwebhook.models.MessageOut;
import io.openweb3.xwebhook.models.MessageRawPayloadOut;
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
 * API tests for MessageApi
 */
@Ignore
public class MessageApiTest {

    private final MessageApi api = new MessageApi();

    
    /**
     * Create Message Attempt For Endpoint
     *
     * Creates and sends a message to the specified endpoint. The message attempt and response from the endpoint is returned. FIXME: use MessageIn for expediency, even though the &#x60;application&#x60; parameter is unused. Since this endpoint isn&#39;t publicly documented anyway, it should be fine
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMessageAttemptForEndpointTest() throws ApiException {
        String appId = null;
        String endpointId = null;
        MessageIn messageIn = null;
        String idempotencyKey = null;
        MessageAttemptOut response = api.createMessageAttemptForEndpoint(appId, endpointId, messageIn, idempotencyKey);

        // TODO: test validations
    }
    
    /**
     * Create Message
     *
     * Creates a new message and dispatches it to all of the application&#39;s endpoints.  The &#x60;eventId&#x60; is an optional custom unique ID. It&#39;s verified to be unique only up to a day, after that no verification will be made. If a message with the same &#x60;eventId&#x60; already exists for any application in your environment, a 409 conflict error will be returned.  The &#x60;eventType&#x60; indicates the type and schema of the event. All messages of a certain &#x60;eventType&#x60; are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have &#x60;channels&#x60;, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don&#39;t imply a specific message content or schema.  The &#x60;payload&#x60; property is the webhook&#39;s body (the actual webhook message). Xwebhook supports payload sizes of up to ~350kb, though it&#39;s generally a good idea to keep webhook payloads small, probably no larger than 40kb.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageCreateTest() throws ApiException {
        String appId = null;
        MessageIn messageIn = null;
        Boolean withContent = null;
        String idempotencyKey = null;
        MessageOut response = api.v1MessageCreate(appId, messageIn, withContent, idempotencyKey);

        // TODO: test validations
    }
    
    /**
     * Delete message payload
     *
     * Delete the given message&#39;s payload. Useful in cases when a message was accidentally sent with sensitive content.  The message can&#39;t be replayed or resent once its payload has been deleted or expired.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageExpungeContentTest() throws ApiException {
        String appId = null;
        String msgId = null;
        api.v1MessageExpungeContent(appId, msgId);

        // TODO: test validations
    }
    
    /**
     * Get Message
     *
     * Get a message by its ID or eventID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageGetTest() throws ApiException {
        String appId = null;
        String msgId = null;
        Boolean withContent = null;
        MessageOut response = api.v1MessageGet(appId, msgId, withContent);

        // TODO: test validations
    }
    
    /**
     * Get Raw Message Payload
     *
     * Get a message raw payload by its ID or eventID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageGetRawPayloadTest() throws ApiException {
        String appId = null;
        String msgId = null;
        MessageRawPayloadOut response = api.v1MessageGetRawPayload(appId, msgId);

        // TODO: test validations
    }
    
    /**
     * List Messages
     *
     * List all of the application&#39;s messages.  The &#x60;before&#x60; and &#x60;after&#x60; parameters let you filter all items created before or after a certain date. These can be used alongside an iterator to paginate over results within a certain window.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageListTest() throws ApiException {
        String appId = null;
        Integer limit = null;
        String iterator = null;
        String channel = null;
        OffsetDateTime before = null;
        OffsetDateTime after = null;
        Boolean withContent = null;
        String tag = null;
        Set<String> eventTypes = null;
        ListResponseMessageOut response = api.v1MessageList(appId, limit, iterator, channel, before, after, withContent, tag, eventTypes);

        // TODO: test validations
    }
    
    /**
     * Stream Events
     *
     * Reads the stream of created messages for an application
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MessageStreamTest() throws ApiException {
        String appId = null;
        Integer limit = null;
        String iterator = null;
        Set<String> eventTypes = null;
        Set<String> channels = null;
        OffsetDateTime after = null;
        MessageStreamOut response = api.v1MessageStream(appId, limit, iterator, eventTypes, channels, after);

        // TODO: test validations
    }
    
}