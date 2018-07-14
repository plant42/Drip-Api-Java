package com.plant42.drip.api.impl.operations;


import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.callbacks.NonDeserializingCallback;
import com.plant42.drip.domain.Campaign;
import com.plant42.drip.domain.Subscriber;

import java.util.List;

public interface CampaignOperations {

    void list(final String accountId, final DeserializingCallback<List<Campaign>> callback);

    void fetch(final String accountId, final String campaignId, final DeserializingCallback<List<Campaign>> callback);

    void subscribers (final String accountId, final String campaignId, final DeserializingCallback<List<Subscriber>> callback);

    void subscriberCampaigns (final String accountId, final String subscriberId, final DeserializingCallback<List<Campaign>> callback);

    void activate(final String accountId, final String campaignId, final NonDeserializingCallback callback);

    void pause(final String accountId, final String campaignId, final NonDeserializingCallback callback);


}
