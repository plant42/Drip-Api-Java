package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ItemMixin extends DripObjectMixin {


    @JsonCreator
    public ItemMixin()
    {}

    @JsonProperty("name")
    String name;

    @JsonProperty("amount")
    int amount;

    @JsonProperty("price")
    int price;

    @JsonProperty("tax")
    int tax;

    @JsonProperty("fees")
    int fees;

    @JsonProperty("discount")
    int discount;

    @JsonProperty("quantity")
    int quantity;


    @JsonProperty("product_id")
    String productId;

    @JsonProperty("upstream_id")
    String upstreamId;


    @JsonProperty("upstream_product_id")
    String upstreamProductId;


    @JsonProperty("upstream_product_variant_id")
    String upstreamProductVariantId;


    @JsonProperty("sku")
    String sky;


    @JsonProperty("taxable")
    boolean taxable;
}
