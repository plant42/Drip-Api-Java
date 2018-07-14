package com.plant42.drip.api.impl.services;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface WorkflowService {

    @GET("/v2/{account_id}/workflows")
    Call<ResponseBody> list(@Header("Authorization") String authorization, @Path("account_id") String accountId);

    @GET("/v2/{account_id}/workflows/{workflow_id}")
    Call<ResponseBody> fetch(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("workflow_id") String workflowId);

    @GET("/v2/{account_id}/workflows/{workflow_id}/triggers")
    Call<ResponseBody> triggers(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("workflow_id") String workflowId);


    @GET("/v2/{account_id}/workflows/{workflow_id}/activate")
    Call<ResponseBody> activate(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("workflow_id") String workflowId);


    @GET("/v2/{account_id}/workflows/{workflow_id}/pause")
    Call<ResponseBody> pause(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("workflow_id") String workflowId);


}
