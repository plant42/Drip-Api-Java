package com.plant42.drip.api.impl.services;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface TagService {

    @GET("/v2/{account_id}/tags")
    Call<ResponseBody> list(@Header("Authorization") String authorization, @Path("account_id") String accountId);



    @POST("/v2/{account_id}/tags")
    Call<ResponseBody> addTagToSubcriber(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Body Map properties);


    @DELETE("/v2/{account_id}/subscribers/{email}/tags/{tag}")
    Call<ResponseBody> removeTagFromSubcriber(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("email") String email, @Path("tag") String tag);

}
