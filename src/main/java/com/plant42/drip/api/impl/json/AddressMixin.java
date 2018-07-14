package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class AddressMixin extends DripObjectMixin {


    @JsonCreator
    public AddressMixin()
    {}

    @JsonProperty("name")
    String name;

    @JsonProperty("first_name")
    String firstName;

    @JsonProperty("last_name")
    String lastName;

    @JsonProperty("company")
    String company;

    @JsonProperty("address_1")
    String address1;

    @JsonProperty("address_2")
    String address2;

    @JsonProperty("city")
    String city;

    @JsonProperty("state")
    String state;

    @JsonProperty("zip")
    String zip;

    @JsonProperty("country")
    String country;

    @JsonProperty("phone")
    String phone;

    @JsonProperty("email")
    String email;
}
