package com.plant42.drip.api.impl.services;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface FormService {

    @GET("/v2/{account_id}/forms")
    Call<ResponseBody> list(@Header("Authorization") String authorization, @Path("account_id") String accountId);

    @GET("/v2/{account_id}/forms/{form_id}")
    Call<ResponseBody> fetch(@Header("Authorization") String authorization, @Path("account_id") String accountId, @Path("form_id") String conversionId);


}
