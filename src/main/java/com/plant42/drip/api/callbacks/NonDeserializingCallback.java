package com.plant42.drip.api.callbacks;

import com.plant42.drip.api.enums.Route;
import com.plant42.drip.api.exceptions.DripException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public abstract class NonDeserializingCallback extends AbstractCallback implements Callback<ResponseBody>, okhttp3.Callback {

    public NonDeserializingCallback() {
        super();
    }


    @Override
    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        System.out.println(String.format("%d - %s", response.code(), response.message()));
        if (response.isSuccessful()) {
            onSuccess();
        } else {
            if (response.errorBody() != null) {
                try {
                    deserializeError(response.errorBody().string());
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            onFailure(call, new DripException("error", null));
        }
    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        onFailure();
    }

    @Override
    public void onFailure(okhttp3.Call call, IOException e) {
        e.printStackTrace();
        onFailure();
    }

    @Override
    public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {
        System.out.println(String.format("%d - %s", response.code(), response.message()));
        if (response.isSuccessful()) {
            onSuccess();
        } else {
            onFailure(call, new IOException("error", null));
        }
    }


}
