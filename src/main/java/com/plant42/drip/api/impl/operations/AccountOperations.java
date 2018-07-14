package com.plant42.drip.api.impl.operations;


import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.domain.Account;

import java.util.List;

public interface AccountOperations {

    void list(final DeserializingCallback<List<Account>> callback);

    void fetch(final String id, final DeserializingCallback<List<Account>> callback);

}
