package com.plant42.drip.api.impl.services;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface SubscriberService {

    @GET("/v2/{account_id}/subscribers")
    Call<ResponseBody> list(@Header("Authorization") String authorization,  @Path("account_id") String accountId);

    @GET("/v2/{account_id}/subscribers/{subscriber_id}")
    Call<ResponseBody> fetch(@Header("Authorization") String authorization, @Path("account_id") String accountId,  @Path("subscriber_id") String subscriberId);

    @POST("/v2/{account_id}/subscribers")
    Call<ResponseBody> create(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Body Map properties);

    @DELETE("/v2/{account_id}/subscribers/{subscriber_id}/remove")
    Call<ResponseBody> unsubscribeFromCampaign(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("subscriber_id") String subscriberId, @Query("campaign_id") String campaignId);

    @DELETE("/v2/{account_id}/subscribers/{subscriber_id}/unsubscribe_all")
    Call<ResponseBody> unsubscribeFromAll(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("subscriber_id") String subscriberId);

    @DELETE("/v2/{account_id}/subscribers/{subscriber_id}")
    Call<ResponseBody> delete(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("subscriber_id") String subscriberId);


}
