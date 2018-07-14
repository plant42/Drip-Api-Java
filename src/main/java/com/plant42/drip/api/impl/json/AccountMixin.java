package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class AccountMixin extends DripObjectMixin {


    @JsonCreator
    public AccountMixin(
        @JsonProperty("id") Long id)
    {}

    @JsonProperty("name")
    String name;

    @JsonProperty("url")
    String url;

    @JsonProperty("default_from_name")
    String defaultFromName;

    @JsonProperty("default_from_email")
    String defaultFromEmail;

    @JsonProperty("default_postal_address")
    String defaultPostalAddress;

    @JsonProperty("primary_email")
    String primaryEmail;

    @JsonProperty("enable_third_party_cookies")
    boolean enableThirdPartyCookies;

    @JsonProperty("phone_number")
    String phoneNUmber;

    @JsonProperty("created_at")
    Date createdAt;

    @JsonProperty("href")
    String href;

}
