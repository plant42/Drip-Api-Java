package com.plant42.drip.api.impl.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.enums.Route;
import com.plant42.drip.api.impl.operations.ConversionOperations;
import com.plant42.drip.api.impl.services.ConversionService;
import com.plant42.drip.domain.Conversion;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;

public class ConversionTemplate extends AbstractTemplate implements ConversionOperations {

    public ConversionTemplate(Retrofit retrofit, OkHttpClient client, ObjectMapper objectMapper) {
        super(retrofit, client, objectMapper);
    }

    @Override
    public void list(final String accountId, DeserializingCallback<List<Conversion>> callback) {

        try {
            ConversionService service = retrofit.create(ConversionService.class);
            Call<ResponseBody> call = service.list(Credentials.basic(this.token,""), accountId);
            callback.setRoute(Route.CONVERSIONS);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void fetch(final String accountId, final String conversionId, final DeserializingCallback<List<Conversion>> callback) {

        try {
            ConversionService service = retrofit.create(ConversionService.class);
            Call<ResponseBody> call = service.fetch(Credentials.basic(this.token,""), accountId, conversionId );
            callback.setRoute(Route.CONVERSIONS);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
