package com.plant42.drip.api.impl.operations;


import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.domain.Broadcast;

import java.util.List;

public interface BroadcastOperations {

    void list(final String accountId, final DeserializingCallback<List<Broadcast>> callback);

    void fetch(final String accountId, final String broadcastId, final DeserializingCallback<List<Broadcast>> callback);

}
