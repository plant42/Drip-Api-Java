package com.plant42.drip.api.impl.operations;


import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.callbacks.NonDeserializingCallback;

import java.util.List;

public interface TagOperations {

    void list(final String accountId, final DeserializingCallback<List<String>> callback);

    void addTagToSubscriber(final String accountId, final String email, final String tag, final NonDeserializingCallback callback);

    void removeTagFromSubscriber(final String accountId, final String email, final String tag, final NonDeserializingCallback callback);
}
