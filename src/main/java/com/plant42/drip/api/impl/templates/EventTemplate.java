package com.plant42.drip.api.impl.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.callbacks.NonDeserializingCallback;
import com.plant42.drip.api.impl.operations.EventOperations;
import com.plant42.drip.api.impl.services.EventService;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventTemplate extends AbstractTemplate implements EventOperations {

    public EventTemplate(Retrofit retrofit, OkHttpClient client, ObjectMapper objectMapper) {
        super(retrofit, client, objectMapper);
    }

    @Override
    public void actions(final String accountId, DeserializingCallback<List<String>> callback) {

        try {
            EventService service = retrofit.create(EventService.class);
            Call<ResponseBody> call = service.list(Credentials.basic(this.token,""), accountId);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void add(String accountId, Map<String, Object> params, NonDeserializingCallback callback) {


        List<Map<String,Object>> subscribers = new ArrayList<>();
        subscribers.add(params);

        Map<String, List<Map<String,Object>>> payload = new HashMap<>();
        payload.put("events", subscribers);

        try {
            EventService service = retrofit.create(EventService.class);
            Call<ResponseBody> call = service.create(Credentials.basic(this.token,""), accountId, payload);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
