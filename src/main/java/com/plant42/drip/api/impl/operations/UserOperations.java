package com.plant42.drip.api.impl.operations;


import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.domain.User;

import java.util.List;

public interface UserOperations {

    void authenticatedUser(final DeserializingCallback<List<User>> callback);



}
