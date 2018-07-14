package com.plant42.drip.api.impl.operations;


import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.callbacks.NonDeserializingCallback;
import com.plant42.drip.domain.Webhook;

import java.util.List;

public interface WebhookOperations {

    void list(final String accountId, final DeserializingCallback<List<Webhook>> callback);

    void fetch(final String accountId, final String webhookId, final DeserializingCallback<List<Webhook>> callback);

    void create(final String accountId, final String postUrl, final List<String> events, final boolean includeReceviedEmail, final DeserializingCallback<List<Webhook>> callback);

    void delete(final String accountId, final String webhookId, final NonDeserializingCallback callback);

}
