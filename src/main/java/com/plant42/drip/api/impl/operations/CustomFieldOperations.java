package com.plant42.drip.api.impl.operations;


import com.plant42.drip.api.callbacks.DeserializingCallback;

import java.util.List;

public interface CustomFieldOperations {

    void list(final String accountId, final DeserializingCallback<List<String>> callback);

}
