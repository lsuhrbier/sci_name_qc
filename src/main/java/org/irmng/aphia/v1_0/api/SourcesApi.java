/*
 * IRMNG REST webservice
 * The definitions and operations are listed below. Click on an operation name to view it's details, and test it.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.irmng.aphia.v1_0.api;

import org.irmng.aphia.v1_0.handler.ApiCallback;
import org.irmng.aphia.v1_0.handler.ApiClient;
import org.irmng.aphia.v1_0.handler.ApiException;
import org.irmng.aphia.v1_0.handler.ApiResponse;
import org.irmng.aphia.v1_0.handler.Configuration;
import org.irmng.aphia.v1_0.handler.Pair;
import org.irmng.aphia.v1_0.handler.ProgressRequestBody;
import org.irmng.aphia.v1_0.handler.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.irmng.aphia.v1_0.model.Source;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SourcesApi {
    private ApiClient apiClient;

    public SourcesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SourcesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for aphiaSourcesByIRMNGID
     * @param ID The IRMNG_ID to search for (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call aphiaSourcesByIRMNGIDCall(Integer ID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/AphiaSourcesByIRMNG_ID/{ID}"
            .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call aphiaSourcesByIRMNGIDValidateBeforeCall(Integer ID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ID' is set
        if (ID == null) {
            throw new ApiException("Missing the required parameter 'ID' when calling aphiaSourcesByIRMNGID(Async)");
        }

        okhttp3.Call call = aphiaSourcesByIRMNGIDCall(ID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get one or more sources/references including links, for one IRMNG_ID
     * Get one or more sources/references including links, for one IRMNG_ID
     * @param ID The IRMNG_ID to search for (required)
     * @return List&lt;Source&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Source> aphiaSourcesByIRMNGID(Integer ID) throws ApiException {
        ApiResponse<List<Source>> resp = aphiaSourcesByIRMNGIDWithHttpInfo(ID);
        return resp.getData();
    }

    /**
     * Get one or more sources/references including links, for one IRMNG_ID
     * Get one or more sources/references including links, for one IRMNG_ID
     * @param ID The IRMNG_ID to search for (required)
     * @return ApiResponse&lt;List&lt;Source&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Source>> aphiaSourcesByIRMNGIDWithHttpInfo(Integer ID) throws ApiException {
        okhttp3.Call call = aphiaSourcesByIRMNGIDValidateBeforeCall(ID, null, null);
        Type localVarReturnType = new TypeToken<List<Source>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get one or more sources/references including links, for one IRMNG_ID (asynchronously)
     * Get one or more sources/references including links, for one IRMNG_ID
     * @param ID The IRMNG_ID to search for (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call aphiaSourcesByIRMNGIDAsync(Integer ID, final ApiCallback<List<Source>> callback) throws ApiException {

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

        okhttp3.Call call = aphiaSourcesByIRMNGIDValidateBeforeCall(ID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Source>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
