package com.plant42.drip.api;

import com.plant42.drip.api.impl.operations.*;

public interface Drip {
    AccountOperations getAuthenticationOperations();
    BroadcastOperations getBroadcastOperations();
    CampaignOperations getCampaignOperations();
    SubscriberOperations getSubscriberOperations();
    ConversionOperations getConversionOperations();
    UserOperations getUserOperations();
    CustomFieldOperations getCustomFieldOperations();
    TagOperations getTagOperations();
    FormOperations getFormOperations();
    EventOperations getEventOperations();
    WorkflowOperations getWorkflowOperations();
    WebhookOperations getWebhookOperations();

    void setToken(String token);
    void shutdown();

}
