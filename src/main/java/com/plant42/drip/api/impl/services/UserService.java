package com.plant42.drip.api.impl.services;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface UserService {

    @GET("/v2/user")
    Call<ResponseBody> user(@Header("Authorization") String authorization);


}
