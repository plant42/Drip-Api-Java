package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.plant42.drip.domain.Address;
import com.plant42.drip.domain.Item;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class OrderMixin extends DripObjectMixin {


    @JsonCreator
    public OrderMixin(
        @JsonProperty("id") Long id)
    {}

    @JsonProperty("provider")
    String provider;

    @JsonProperty("upstream_id")
    String upstreamId;

    @JsonProperty("identifier")
    String identifier;

    @JsonProperty("amount")
    int amount;

    @JsonProperty("tax")
    int tax;


    @JsonProperty("fees")
    int fees;


    @JsonProperty("discount")
    int discount;

    @JsonProperty("permalink")
    String permalink;

    @JsonProperty("currency_code")
    String currencyCode;

    @JsonProperty("occurred_at")
    Date occurredAt;

    @JsonProperty("closed_at")
    Date closedAt;

    @JsonProperty("cancelled_at")
    Date cancelledAt;

    @JsonProperty("financial_state")
    String financialState;


    @JsonProperty("fulfillment_state")
    String fulfillmentState;


    @JsonProperty("billing_address")
    Address billingAddress;


    @JsonProperty("shipping_address")
    Address shippingAddress;


    @JsonProperty("items")
    List<Item> items;
}
