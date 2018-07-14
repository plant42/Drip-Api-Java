package com.plant42.drip.api.callbacks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.plant42.drip.api.enums.Route;
import com.plant42.drip.api.exceptions.DripException;
import com.plant42.drip.api.impl.json.DripModule;
import com.plant42.drip.domain.DripError;
import com.plant42.drip.domain.Link;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class DeserializingCallback<S> extends AbstractCallback implements Callback<ResponseBody> {


    protected S object;
    protected Map<String,String> links;

    public DeserializingCallback() {
        super();

    }


    @Override
    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        System.out.println(String.format("TS: %d - Code: %d - %s", System.currentTimeMillis(), response.code(), response.message()));

        code = response.code();

        if (response.isSuccessful()) {
            try {

                if (response.body() != null) {
                    responseBody = response.body().string();
                    object =  (S)deserialize( responseBody );
                }
                onSuccess();

            } catch (Exception e) {
                try {
                    if (response.errorBody() != null) {
                        errorResponseBody = response.errorBody().string();
                    }
                    onFailure(call, new DripException("API Error", new Error(response.message()) )  );
                } catch (Exception te) {
                    System.out.println(te.getMessage());;
                }
            }
        } else {
            try {
                if (response.errorBody() != null) {
                    errorResponseBody = response.errorBody().string();
                }
                onFailure(call, new DripException("API Error", new Error(response.message()) )  );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        try {
            this.deserializeError(errorResponseBody);
        } catch (Exception e) {
            e.printStackTrace();
        }
        onFailure();
    }
}
