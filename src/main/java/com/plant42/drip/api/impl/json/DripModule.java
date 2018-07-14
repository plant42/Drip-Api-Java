package com.plant42.drip.api.impl.json;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.plant42.drip.domain.*;

public class DripModule extends SimpleModule {

    private static final long serialVersionUID = 1L;

    public DripModule() {
        super("DripModule");
    }

    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(Account.class, AccountMixin.class);
        context.setMixInAnnotations(Broadcast.class, BroadcastMixin.class);
        context.setMixInAnnotations(Campaign.class, CampaignMixin.class);
        context.setMixInAnnotations(Subscriber.class, SubscriberMixin.class);
        context.setMixInAnnotations(Conversion.class, ConversionMixin.class);
        context.setMixInAnnotations(User.class, UserMixin.class);
        context.setMixInAnnotations(Form.class, FormMixin.class);
        context.setMixInAnnotations(Address.class, AddressMixin.class);
        context.setMixInAnnotations(Item.class, ItemMixin.class);
        context.setMixInAnnotations(Order.class, OrderMixin.class);
        context.setMixInAnnotations(Workflow.class, WorkflowMixin.class);
        context.setMixInAnnotations(RequiredAction.class, ActionMixin.class);
        context.setMixInAnnotations(Trigger.class, TriggerMixin.class);
        context.setMixInAnnotations(Webhook.class, WebhookMixin.class);

    }
}
