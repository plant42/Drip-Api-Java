package com.plant42.drip.api.impl.operations;


import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.domain.Conversion;

import java.util.List;

public interface ConversionOperations {

    void list(final String accountId, final DeserializingCallback<List<Conversion>> callback);

    void fetch(final String accountId, final String conversionId, final DeserializingCallback<List<Conversion>> callback);

}
