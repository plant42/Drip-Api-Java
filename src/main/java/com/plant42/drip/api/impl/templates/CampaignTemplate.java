package com.plant42.drip.api.impl.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.callbacks.NonDeserializingCallback;
import com.plant42.drip.api.impl.operations.CampaignOperations;
import com.plant42.drip.api.impl.services.CampaignService;
import com.plant42.drip.domain.Campaign;
import com.plant42.drip.domain.Subscriber;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;

public class CampaignTemplate extends AbstractTemplate implements CampaignOperations {

    public CampaignTemplate(Retrofit retrofit, OkHttpClient client, ObjectMapper objectMapper) {
        super(retrofit, client, objectMapper);
    }

    @Override
    public void list(final String accountId, DeserializingCallback<List<Campaign>> callback) {

        try {
            CampaignService service = retrofit.create(CampaignService.class);
            Call<ResponseBody> call = service.list(Credentials.basic(this.token,""), accountId);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void fetch(final String accountId, final String campaignId, final DeserializingCallback<List<Campaign>> callback) {

        try {
            CampaignService service = retrofit.create(CampaignService.class);
            Call<ResponseBody> call = service.fetch(Credentials.basic(this.token,""), accountId, campaignId );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    @Override
    public void subscribers(final String accountId, final String campaignId, final DeserializingCallback<List<Subscriber>> callback) {

        try {
            CampaignService service = retrofit.create(CampaignService.class);
            Call<ResponseBody> call = service.subscribers(Credentials.basic(this.token,""), accountId, campaignId );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    @Override
    public void subscriberCampaigns(final String accountId, final String subscriberId, final DeserializingCallback<List<Campaign>> callback) {

        try {
            CampaignService service = retrofit.create(CampaignService.class);
            Call<ResponseBody> call = service.subscriberCampaigns(Credentials.basic(this.token,""), accountId, subscriberId );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }



    @Override
    public void activate(final String accountId, final String campaignId, final NonDeserializingCallback callback) {

        try {
            CampaignService service = retrofit.create(CampaignService.class);
            Call<ResponseBody> call = service.activate(Credentials.basic(this.token,""), accountId, campaignId );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    @Override
    public void pause(final String accountId, final String campaignId, final NonDeserializingCallback callback) {

        try {
            CampaignService service = retrofit.create(CampaignService.class);
            Call<ResponseBody> call = service.pause(Credentials.basic(this.token,""), accountId, campaignId );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
