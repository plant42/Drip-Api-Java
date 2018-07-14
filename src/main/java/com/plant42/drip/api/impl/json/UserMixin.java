package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class UserMixin extends DripObjectMixin {


    @JsonCreator
    public UserMixin()
    {}

    @JsonProperty("name")
    String name;

    @JsonProperty("email")
    String email;

    @JsonProperty("time_zone")
    String timezone;

}
