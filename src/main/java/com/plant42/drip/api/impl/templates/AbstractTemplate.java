package com.plant42.drip.api.impl.templates;


import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public abstract class AbstractTemplate {
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    protected final OkHttpClient client;
    protected final Retrofit retrofit;


    protected ObjectMapper objectMapper;

    protected String token;

    public AbstractTemplate(Retrofit retrofit, OkHttpClient client, ObjectMapper objectMapper) {
        this.retrofit = retrofit;
        this.client = client;
        this.objectMapper = objectMapper;
    }

    /**
     * Set the authentication token.
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

}
