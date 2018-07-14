package com.plant42.drip.api.impl.operations;


import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.domain.Form;

import java.util.List;

public interface FormOperations {

    void list(final String accountId, final DeserializingCallback<List<Form>> callback);

    void fetch(final String accountId, final String conversionId, final DeserializingCallback<List<Form>> callback);

}
