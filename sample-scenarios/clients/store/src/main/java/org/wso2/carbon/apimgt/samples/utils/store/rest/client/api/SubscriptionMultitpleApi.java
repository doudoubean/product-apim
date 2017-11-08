/*
 * WSO2 API Manager - Store
 * This specifies a **RESTful API** for WSO2 **API Manager** - Store.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.1.66/components/apimgt/org.wso2.carbon.apimgt.rest.api.store/src/main/resources/store-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.11.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.samples.utils.store.rest.client.api;

import org.wso2.carbon.apimgt.samples.utils.store.rest.client.ApiCallback;
import org.wso2.carbon.apimgt.samples.utils.store.rest.client.ApiClient;
import org.wso2.carbon.apimgt.samples.utils.store.rest.client.ApiException;
import org.wso2.carbon.apimgt.samples.utils.store.rest.client.ApiResponse;
import org.wso2.carbon.apimgt.samples.utils.store.rest.client.Configuration;
import org.wso2.carbon.apimgt.samples.utils.store.rest.client.Pair;
import org.wso2.carbon.apimgt.samples.utils.store.rest.client.ProgressRequestBody;
import org.wso2.carbon.apimgt.samples.utils.store.rest.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.carbon.apimgt.samples.utils.store.rest.client.model.Error;
import org.wso2.carbon.apimgt.samples.utils.store.rest.client.model.Subscription;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptionMultitpleApi {
    private ApiClient apiClient;

    public SubscriptionMultitpleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SubscriptionMultitpleApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for subscriptionsMultiplePost */
    private com.squareup.okhttp.Call subscriptionsMultiplePostCall(List<Subscription> body, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/subscriptions/multiple".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null)
        localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call subscriptionsMultiplePostValidateBeforeCall(List<Subscription> body, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling subscriptionsMultiplePost(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling subscriptionsMultiplePost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = subscriptionsMultiplePostCall(body, contentType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add new subscriptions 
     * This operation can be used to add a new subscriptions providing the ids of the APIs and the applications. 
     * @param body Subscription objects that should to be added  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @return Subscription
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Subscription subscriptionsMultiplePost(List<Subscription> body, String contentType) throws ApiException {
        ApiResponse<Subscription> resp = subscriptionsMultiplePostWithHttpInfo(body, contentType);
        return resp.getData();
    }

    /**
     * Add new subscriptions 
     * This operation can be used to add a new subscriptions providing the ids of the APIs and the applications. 
     * @param body Subscription objects that should to be added  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @return ApiResponse&lt;Subscription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Subscription> subscriptionsMultiplePostWithHttpInfo(List<Subscription> body, String contentType) throws ApiException {
        com.squareup.okhttp.Call call = subscriptionsMultiplePostValidateBeforeCall(body, contentType, null, null);
        Type localVarReturnType = new TypeToken<Subscription>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add new subscriptions  (asynchronously)
     * This operation can be used to add a new subscriptions providing the ids of the APIs and the applications. 
     * @param body Subscription objects that should to be added  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscriptionsMultiplePostAsync(List<Subscription> body, String contentType, final ApiCallback<Subscription> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = subscriptionsMultiplePostValidateBeforeCall(body, contentType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Subscription>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
