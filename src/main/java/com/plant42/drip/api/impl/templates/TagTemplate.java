package com.plant42.drip.api.impl.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.callbacks.NonDeserializingCallback;
import com.plant42.drip.api.enums.Route;
import com.plant42.drip.api.impl.operations.TagOperations;
import com.plant42.drip.api.impl.services.TagService;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TagTemplate extends AbstractTemplate implements TagOperations {

    public TagTemplate(Retrofit retrofit, OkHttpClient client, ObjectMapper objectMapper) {
        super(retrofit, client, objectMapper);
    }

    @Override
    public void list(final String accountId, DeserializingCallback<List<String>> callback) {

        try {
            TagService service = retrofit.create(TagService.class);
            Call<ResponseBody> call = service.list(Credentials.basic(this.token,""), accountId);
            callback.setRoute(Route.TAGS);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addTagToSubscriber(String accountId, String email, String tag, NonDeserializingCallback callback) {


        //== create webhook
        Map<String,Object> tagObj = new HashMap<>();
        tagObj.put("email", email);
        tagObj.put("tag", tag);

        List<Map<String,Object>> webhooks = new ArrayList<>();
        webhooks.add(tagObj);

        Map<String, List<Map<String,Object>>> payload = new HashMap<>();
        payload.put("tags", webhooks);

        try {
            TagService service = retrofit.create(TagService.class);
            Call<ResponseBody> call = service.addTagToSubcriber(Credentials.basic(this.token,""), accountId, payload);
            callback.setRoute(Route.TAGS);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }


    @Override
    public void removeTagFromSubscriber(String accountId, String email, String tag, NonDeserializingCallback callback) {



        try {
            TagService service = retrofit.create(TagService.class);
            Call<ResponseBody> call = service.removeTagFromSubcriber(Credentials.basic(this.token,""), accountId, email, tag);
            callback.setRoute(Route.NONE);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
