package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ErrorMixin extends DripObjectMixin {


    @JsonCreator
    public ErrorMixin()
    {}

    @JsonProperty("message")
    String message;

    @JsonProperty("code")
    String code;

    @JsonProperty("attribute")
    String attribute;

}
