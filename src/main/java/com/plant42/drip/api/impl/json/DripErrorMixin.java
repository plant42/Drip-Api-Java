package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class DripErrorMixin extends DripObjectMixin {


    @JsonCreator
    public DripErrorMixin()
    {}

    @JsonProperty("message")
    String message;

    @JsonProperty("code")
    String code;

}
