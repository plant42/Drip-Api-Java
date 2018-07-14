package com.plant42.drip.api.impl.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.impl.operations.BroadcastOperations;
import com.plant42.drip.api.impl.services.BroadcastService;
import com.plant42.drip.domain.Broadcast;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;

public class BroadcastTemplate extends AbstractTemplate implements BroadcastOperations {

    public BroadcastTemplate(Retrofit retrofit, OkHttpClient client, ObjectMapper objectMapper) {
        super(retrofit, client, objectMapper);
    }

    @Override
    public void list(final String accountId, DeserializingCallback<List<Broadcast>> callback) {

        try {
            BroadcastService service = retrofit.create(BroadcastService.class);
            Call<ResponseBody> call = service.list(Credentials.basic(this.token,""), accountId);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void fetch(final String accountId, final String broadcastId, final DeserializingCallback<List<Broadcast>> callback) {

        try {
            BroadcastService service = retrofit.create(BroadcastService.class);
            Call<ResponseBody> call = service.fetch(Credentials.basic(this.token,""), accountId, broadcastId );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
