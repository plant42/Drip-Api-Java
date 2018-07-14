package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ConversionMixin extends DripObjectMixin {


    @JsonCreator
    public ConversionMixin(
        @JsonProperty("id") Long id)
    {}

    @JsonProperty("status")
    String status;

    @JsonProperty("url")
    String url;

    @JsonProperty("default_vaøue")
    int defaultValue;

    @JsonProperty("counting_method")
    String countingMethod;

    @JsonProperty("created_at")
    Date createdAt;

    @JsonProperty("href")
    String href;

}
