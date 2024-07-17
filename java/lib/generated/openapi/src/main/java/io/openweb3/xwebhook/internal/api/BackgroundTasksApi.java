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

import io.openweb3.xwebhook.internal.ApiCallback;
import io.openweb3.xwebhook.internal.ApiClient;
import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.internal.ApiResponse;
import io.openweb3.xwebhook.internal.Configuration;
import io.openweb3.xwebhook.internal.Pair;
import io.openweb3.xwebhook.internal.ProgressRequestBody;
import io.openweb3.xwebhook.internal.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.openweb3.xwebhook.models.BackgroundTaskOut;
import io.openweb3.xwebhook.models.BackgroundTaskStatus;
import io.openweb3.xwebhook.models.BackgroundTaskType;
import io.openweb3.xwebhook.models.HTTPValidationError;
import io.openweb3.xwebhook.models.HttpErrorOut;
import io.openweb3.xwebhook.models.ListResponseBackgroundTaskOut;
import io.openweb3.xwebhook.models.Ordering;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackgroundTasksApi {
    private ApiClient localVarApiClient;

    public BackgroundTasksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BackgroundTasksApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getBackgroundTask
     * @param taskId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     <table border="1">
       <caption>Response Deatails</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBackgroundTaskCall(String taskId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/background-task/{task_id}"
            .replaceAll("\\{" + "task_id" + "\\}", localVarApiClient.escapeString(taskId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "HTTPBearer" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBackgroundTaskValidateBeforeCall(String taskId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling getBackgroundTask(Async)");
        }
        

        okhttp3.Call localVarCall = getBackgroundTaskCall(taskId, _callback);
        return localVarCall;

    }

    /**
     * Get Background Task
     * Get a background task by ID.
     * @param taskId  (required)
     * @return BackgroundTaskOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     <table border="1">
       <caption>Response Deatails</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public BackgroundTaskOut getBackgroundTask(String taskId) throws ApiException {
        ApiResponse<BackgroundTaskOut> localVarResp = getBackgroundTaskWithHttpInfo(taskId);
        return localVarResp.getData();
    }

    /**
     * Get Background Task
     * Get a background task by ID.
     * @param taskId  (required)
     * @return ApiResponse&lt;BackgroundTaskOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     <table border="1">
       <caption>Response Deatails</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BackgroundTaskOut> getBackgroundTaskWithHttpInfo(String taskId) throws ApiException {
        okhttp3.Call localVarCall = getBackgroundTaskValidateBeforeCall(taskId, null);
        Type localVarReturnType = new TypeToken<BackgroundTaskOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Background Task (asynchronously)
     * Get a background task by ID.
     * @param taskId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     <table border="1">
       <caption>Response Deatails</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBackgroundTaskAsync(String taskId, final ApiCallback<BackgroundTaskOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBackgroundTaskValidateBeforeCall(taskId, _callback);
        Type localVarReturnType = new TypeToken<BackgroundTaskOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listBackgroundTasks
     * @param status Filter the response based on the status (optional)
     * @param task Filter the response based on the type (optional)
     * @param limit Limit the number of returned items (optional)
     * @param iterator The iterator returned from a prior invocation (optional)
     * @param order The sorting order of the returned items (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     <table border="1">
       <caption>Response Deatails</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listBackgroundTasksCall(BackgroundTaskStatus status, BackgroundTaskType task, Integer limit, String iterator, Ordering order, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/background-task";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (task != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("task", task));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (iterator != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("iterator", iterator));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "HTTPBearer" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listBackgroundTasksValidateBeforeCall(BackgroundTaskStatus status, BackgroundTaskType task, Integer limit, String iterator, Ordering order, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listBackgroundTasksCall(status, task, limit, iterator, order, _callback);
        return localVarCall;

    }

    /**
     * List Background Tasks
     * List background tasks executed in the past 90 days.
     * @param status Filter the response based on the status (optional)
     * @param task Filter the response based on the type (optional)
     * @param limit Limit the number of returned items (optional)
     * @param iterator The iterator returned from a prior invocation (optional)
     * @param order The sorting order of the returned items (optional)
     * @return ListResponseBackgroundTaskOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     <table border="1">
       <caption>Response Deatails</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ListResponseBackgroundTaskOut listBackgroundTasks(BackgroundTaskStatus status, BackgroundTaskType task, Integer limit, String iterator, Ordering order) throws ApiException {
        ApiResponse<ListResponseBackgroundTaskOut> localVarResp = listBackgroundTasksWithHttpInfo(status, task, limit, iterator, order);
        return localVarResp.getData();
    }

    /**
     * List Background Tasks
     * List background tasks executed in the past 90 days.
     * @param status Filter the response based on the status (optional)
     * @param task Filter the response based on the type (optional)
     * @param limit Limit the number of returned items (optional)
     * @param iterator The iterator returned from a prior invocation (optional)
     * @param order The sorting order of the returned items (optional)
     * @return ApiResponse&lt;ListResponseBackgroundTaskOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     <table border="1">
       <caption>Response Deatails</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListResponseBackgroundTaskOut> listBackgroundTasksWithHttpInfo(BackgroundTaskStatus status, BackgroundTaskType task, Integer limit, String iterator, Ordering order) throws ApiException {
        okhttp3.Call localVarCall = listBackgroundTasksValidateBeforeCall(status, task, limit, iterator, order, null);
        Type localVarReturnType = new TypeToken<ListResponseBackgroundTaskOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Background Tasks (asynchronously)
     * List background tasks executed in the past 90 days.
     * @param status Filter the response based on the status (optional)
     * @param task Filter the response based on the type (optional)
     * @param limit Limit the number of returned items (optional)
     * @param iterator The iterator returned from a prior invocation (optional)
     * @param order The sorting order of the returned items (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     <table border="1">
       <caption>Response Deatails</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listBackgroundTasksAsync(BackgroundTaskStatus status, BackgroundTaskType task, Integer limit, String iterator, Ordering order, final ApiCallback<ListResponseBackgroundTaskOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = listBackgroundTasksValidateBeforeCall(status, task, limit, iterator, order, _callback);
        Type localVarReturnType = new TypeToken<ListResponseBackgroundTaskOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
