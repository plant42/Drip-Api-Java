package com.plant42.drip.api.impl.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.enums.Route;
import com.plant42.drip.api.impl.operations.AccountOperations;
import com.plant42.drip.api.impl.services.AccountService;
import com.plant42.drip.domain.Account;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;

public class AccountTemplate extends AbstractTemplate implements AccountOperations {

    public AccountTemplate(Retrofit retrofit, OkHttpClient client, ObjectMapper objectMapper) {
        super(retrofit, client, objectMapper);
    }

    @Override
    public void list(DeserializingCallback<List<Account>> callback) {

        try {
            AccountService service = retrofit.create(AccountService.class);
            Call<ResponseBody> call = service.list(Credentials.basic(this.token,""));
            callback.setRoute(Route.ACCOUNTS);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void fetch(final String id, final DeserializingCallback<List<Account>> callback) {

        try {
            AccountService service = retrofit.create(AccountService.class);
            Call<ResponseBody> call = service.fetch(Credentials.basic(this.token,""), id );
            callback.setRoute(Route.ACCOUNTS);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
