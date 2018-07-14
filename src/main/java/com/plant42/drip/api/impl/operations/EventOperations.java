package com.plant42.drip.api.impl.operations;


import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.callbacks.NonDeserializingCallback;
import com.plant42.drip.domain.Subscriber;

import java.util.List;
import java.util.Map;

public interface EventOperations {

    void actions(final String accountId, final DeserializingCallback<List<String>> callback);

    void add(final String accountId, Map<String, Object> params, final NonDeserializingCallback callback);

}
