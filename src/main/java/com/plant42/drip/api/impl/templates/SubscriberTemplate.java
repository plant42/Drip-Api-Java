package com.plant42.drip.api.impl.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.callbacks.NonDeserializingCallback;
import com.plant42.drip.api.enums.Route;
import com.plant42.drip.api.impl.operations.SubscriberOperations;
import com.plant42.drip.api.impl.services.SubscriberService;
import com.plant42.drip.domain.Subscriber;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriberTemplate extends AbstractTemplate implements SubscriberOperations {

    public SubscriberTemplate(Retrofit retrofit, OkHttpClient client, ObjectMapper objectMapper) {
        super(retrofit, client, objectMapper);
    }

    @Override
    public void list(final String accountId, DeserializingCallback<List<Subscriber>> callback) {

        try {
            SubscriberService service = retrofit.create(SubscriberService.class);
            Call<ResponseBody> call = service.list(Credentials.basic(this.token,""), accountId);
            callback.setRoute(Route.SUBSCRIBERS);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void fetch(final String accountId, final String subscriberId, final DeserializingCallback<List<Subscriber>> callback) {

        try {
            SubscriberService service = retrofit.create(SubscriberService.class);
            Call<ResponseBody> call = service.fetch(Credentials.basic(this.token,""), accountId, subscriberId );
            callback.setRoute(Route.SUBSCRIBERS);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    @Override
    public void create(String accountId, Map<String,Object> params, DeserializingCallback<List<Subscriber>> callback) {


        List<Map<String,Object>> subscribers = new ArrayList<>();
        subscribers.add(params);

        Map<String, List<Map<String,Object>>> payload = new HashMap<>();
        payload.put("subscribers", subscribers);
        try {
            SubscriberService service = retrofit.create(SubscriberService.class);
            Call<ResponseBody> call = service.create(Credentials.basic(this.token,""), accountId, payload);
            callback.setRoute(Route.SUBSCRIBERS);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void unsubscribeFromCampaign(String accountId, String subscriberId, String campaignId, DeserializingCallback<List<Subscriber>> callback) {

        try {
            SubscriberService service = retrofit.create(SubscriberService.class);
            Call<ResponseBody> call = service.unsubscribeFromCampaign(Credentials.basic(this.token,""), accountId, subscriberId, campaignId );
            callback.setRoute(Route.SUBSCRIBERS);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void unsubscribeFromAllCampaigns(String accountId, String subscriberId, DeserializingCallback<List<Subscriber>> callback) {

        try {
            SubscriberService service = retrofit.create(SubscriberService.class);
            Call<ResponseBody> call = service.unsubscribeFromAll(Credentials.basic(this.token,""), accountId, subscriberId );
            callback.setRoute(Route.SUBSCRIBERS);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String accountId, String subscriberId, NonDeserializingCallback callback) {
        try {
            SubscriberService service = retrofit.create(SubscriberService.class);
            Call<ResponseBody> call = service.delete(Credentials.basic(this.token,""), accountId, subscriberId );
            callback.setRoute(Route.DELETE);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
