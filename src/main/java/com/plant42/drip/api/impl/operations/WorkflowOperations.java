package com.plant42.drip.api.impl.operations;


import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.callbacks.NonDeserializingCallback;
import com.plant42.drip.domain.Trigger;
import com.plant42.drip.domain.Workflow;

import java.util.List;

public interface WorkflowOperations {

    void list(final String accountId, final DeserializingCallback<List<Workflow>> callback);

    void fetch(final String accountId, final String workflowId, final DeserializingCallback<List<Workflow>> callback);

    void triggers(final String accountId, final String workflowId, final DeserializingCallback<List<Trigger>> callback);

    void activate(final String accountId, final String workflowId, final NonDeserializingCallback callback);

    void pause(final String accountId, final String workflowId, final NonDeserializingCallback callback);

}
