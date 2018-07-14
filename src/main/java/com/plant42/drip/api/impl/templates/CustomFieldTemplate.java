package com.plant42.drip.api.impl.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.enums.Route;
import com.plant42.drip.api.impl.operations.CustomFieldOperations;
import com.plant42.drip.api.impl.services.CustomFieldService;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;

public class CustomFieldTemplate extends AbstractTemplate implements CustomFieldOperations {

    public CustomFieldTemplate(Retrofit retrofit, OkHttpClient client, ObjectMapper objectMapper) {
        super(retrofit, client, objectMapper);
    }

    @Override
    public void list(final String accountId, DeserializingCallback<List<String>> callback) {

        try {
            CustomFieldService service = retrofit.create(CustomFieldService.class);
            Call<ResponseBody> call = service.list(Credentials.basic(this.token,""), accountId);
            callback.setRoute(Route.CUSTOM_FIELDS);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


}
