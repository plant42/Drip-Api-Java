package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ActionMixin extends DripObjectMixin {


    @JsonCreator
    public ActionMixin()
    {}

    @JsonProperty("code")
    String code;

    @JsonProperty("message")
    String message;


}
