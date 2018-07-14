package com.plant42.drip.api.impl.services;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface CampaignService {

    @GET("/v2/{account_id}/campaigns")
    Call<ResponseBody> list(@Header("Authorization") String authorization, @Path("account_id") String accountId);

    @GET("/v2/{account_id}/campaigns/{campaign_id}")
    Call<ResponseBody> fetch(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("campaign_id") String campaignId);

    @GET("/v2/{account_id}/campaigns/{campaign_id}/subscribers")
    Call<ResponseBody> subscribers(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("campaign_id") String campaignId);

    @GET("/v2/{account_id}/subscribers/{subscriber_id}/campaign_subscriptions")
    Call<ResponseBody> subscriberCampaigns(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("subscriber_id") String subscriberId);

    @POST("/v2/{account_id}/campaigns/{campaign_id}/activate")
    Call<ResponseBody> activate(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("campaign_id") String campaignId);

    @POST("/v2/{account_id}/campaigns/{campaign_id}/pause")
    Call<ResponseBody> pause(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("campaign_id") String campaignId);


}
