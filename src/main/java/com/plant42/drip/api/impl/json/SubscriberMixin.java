package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class SubscriberMixin extends DripObjectMixin {


    @JsonCreator
    public SubscriberMixin(
        @JsonProperty("id") Long id)
    {}

    @JsonProperty("status")
    String status;

    @JsonProperty("email")
    String email;

    @JsonProperty("eu_consent")
    String euConsent;

    @JsonProperty("timezone")
    String timezone;

    @JsonProperty("utc_offset")
    int utfOffset;

    @JsonProperty("visitor_uuid")
    String visitorUUID;

    @JsonProperty("custom_fields")
    Map<String,String> customFields;

    @JsonProperty("ip_address")
    String ipAddress;

    @JsonProperty("user_agent")
    String userAgent;

    @JsonProperty("original_referrer")
    String originalReferrer;

    @JsonProperty("landing_url")
    String landingUrl;

    @JsonProperty("prospect")
    boolean prospect;

    @JsonProperty("lead_score")
    int leadScore;

    @JsonProperty("lifetime_value")
    int lifetimeValue;
;
    @JsonProperty("created_at")
    Date createdAt;

    @JsonProperty("href")
    String href;

    @JsonProperty("user_id")
    String userId;

    @JsonProperty("base_lead_score")
    int baseLeadScore;
}
