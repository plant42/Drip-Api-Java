package com.plant42.drip.api.impl.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.callbacks.NonDeserializingCallback;
import com.plant42.drip.api.impl.operations.WebhookOperations;
import com.plant42.drip.api.impl.services.WebhookService;
import com.plant42.drip.domain.Webhook;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebhookTemplate extends AbstractTemplate implements WebhookOperations {

    public WebhookTemplate(Retrofit retrofit, OkHttpClient client, ObjectMapper objectMapper) {
        super(retrofit, client, objectMapper);
    }

    @Override
    public void list(final String accountId, DeserializingCallback<List<Webhook>> callback) {

        try {
            WebhookService service = retrofit.create(WebhookService.class);
            Call<ResponseBody> call = service.list(Credentials.basic(this.token,""), accountId);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void fetch(final String accountId, final String webhookId, final DeserializingCallback<List<Webhook>> callback) {

        try {
            WebhookService service = retrofit.create(WebhookService.class);
            Call<ResponseBody> call = service.fetch(Credentials.basic(this.token,""), accountId, webhookId );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(final String accountId, final String postUrl, final List<String> events, final boolean includeReceviedEmail, final DeserializingCallback<List<Webhook>> callback) {

        //== create webhook
        Map<String,Object> webhook = new HashMap<>();
        webhook.put("post_url", postUrl);
        webhook.put("include_received_email", includeReceviedEmail);
        if (events != null) {
            webhook.put("events", events);
        }
        List<Map<String,Object>> webhooks = new ArrayList<>();
        webhooks.add(webhook);

        Map<String, List<Map<String,Object>>> payload = new HashMap<>();
        payload.put("webhooks", webhooks);

        try {
            WebhookService service = retrofit.create(WebhookService.class);
            Call<ResponseBody> call = service.create(Credentials.basic(this.token,""), accountId,  payload );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    @Override
    public void delete(final String accountId, final String webhookId, final NonDeserializingCallback callback) {

        try {
            WebhookService service = retrofit.create(WebhookService.class);
            Call<ResponseBody> call = service.delete(Credentials.basic(this.token,""), accountId, webhookId );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
