package com.plant42.drip.api.impl.operations;


import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.callbacks.NonDeserializingCallback;
import com.plant42.drip.domain.Subscriber;

import java.util.List;
import java.util.Map;

public interface SubscriberOperations {

    void list(final String accountId, final DeserializingCallback<List<Subscriber>> callback);

    void fetch(final String accountId, final String subscriberId, final DeserializingCallback<List<Subscriber>> callback);

    void unsubscribeFromCampaign(final String accountId, final String subscriberId, final String campaignId, final DeserializingCallback<List<Subscriber>> callback);

    void create(final String accountId, Map<String, Object> params, final DeserializingCallback<List<Subscriber>> callback);

    void unsubscribeFromAllCampaigns(final String accountId, final String subscriberId, final DeserializingCallback<List<Subscriber>> callback);

    void delete(final String accountId, final String subscriberId, final NonDeserializingCallback callback);

}
