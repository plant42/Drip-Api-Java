package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class BroadcastMixin extends DripObjectMixin {


    @JsonCreator
    public BroadcastMixin(
        @JsonProperty("id") Long id)
    {}

    @JsonProperty("status")
    String status;

    @JsonProperty("name")
    String name;

    @JsonProperty("from_name")
    String fromName;

    @JsonProperty("from_email")
    String fromEmail;

    @JsonProperty("postal_address")
    String postalAddress;

    @JsonProperty("localize_sending_time")
    boolean localizedSendingTime;

    @JsonProperty("send_at")
    Date sendAt;

    @JsonProperty("bcc")
    List<String> bcc;

    @JsonProperty("created_at")
    Date createdAt;

    @JsonProperty("href")
    String href;

    @JsonProperty("subject")
    String subject;

    @JsonProperty("htmlBody")
    String htmlBody;

    @JsonProperty("textBody")
    String textBody;


}
