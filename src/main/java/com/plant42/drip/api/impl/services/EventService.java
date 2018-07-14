package com.plant42.drip.api.impl.services;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface EventService {

    @GET("/v2/{account_id}/event_actions")
    Call<ResponseBody> list(@Header("Authorization") String authorization, @Path("account_id") String accountId);


    @POST("/v2/{account_id}/events")
    Call<ResponseBody> create(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Body Map properties);

}
