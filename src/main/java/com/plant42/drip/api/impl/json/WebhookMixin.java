package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class WebhookMixin extends DripObjectMixin {


    @JsonCreator
    public WebhookMixin(
        @JsonProperty("id") Long id)
    {}

    @JsonProperty("href")
    String href;

    @JsonProperty("post_url")
    String postUrl;

    @JsonProperty("version")
    String version;

    @JsonProperty("include_received_email")
    boolean includeReceivedEmail;

    @JsonProperty("events")
    List<String> events;

    @JsonProperty("created_at")
    Date createdAt;


}
