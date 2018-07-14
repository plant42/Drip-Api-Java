package com.plant42.drip.api.impl.services;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface WebhookService {

    @GET("/v2/{account_id}/webhooks")
    Call<ResponseBody> list(@Header("Authorization") String authorization, @Path("account_id") String accountId);

    @GET("/v2/{account_id}/webhooks/{webhook_id}")
    Call<ResponseBody> fetch(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("webhook_id") String webhookId);


    @POST("/v2/{account_id}/webhooks")
    Call<ResponseBody> create(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Body Map properties);

    @DELETE("/v2/{account_id}/webhooks/{webhook_id}")
    Call<ResponseBody> delete(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("webhook_id") String webhookId);

}
