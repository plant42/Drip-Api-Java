package com.plant42.drip.api.impl.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.impl.operations.UserOperations;
import com.plant42.drip.api.impl.services.UserService;
import com.plant42.drip.domain.User;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;

public class UserTemplate extends AbstractTemplate implements UserOperations {

    public UserTemplate(Retrofit retrofit, OkHttpClient client, ObjectMapper objectMapper) {
        super(retrofit, client, objectMapper);
    }

    @Override
    public void authenticatedUser(DeserializingCallback<List<User>> callback) {

        try {
            UserService service = retrofit.create(UserService.class);
            Call<ResponseBody> call = service.user(Credentials.basic(this.token,""));
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


}
