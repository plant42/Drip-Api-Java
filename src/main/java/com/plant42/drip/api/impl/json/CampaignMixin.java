package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class CampaignMixin extends DripObjectMixin {


    @JsonCreator
    public CampaignMixin(
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

    @JsonProperty("minutes_from_midnight")
    int minutesFromMidnight;

    @JsonProperty("localize_sending_time")
    boolean localizeSendingTime;

    @JsonProperty("days_of_the_week_mask")
    String daysOfTheWeekMask;

    @JsonProperty("start_immediately")
    boolean startImmediately;

    @JsonProperty("double_opt_in")
    boolean doubleOptIn;

    @JsonProperty("send_to_confirmation_page")
    boolean sendToConfirmationPage;

    @JsonProperty("use_custom_confirmation_page")
    boolean useCustomConfirmationPage;

    @JsonProperty("post_confirmation_url")
    String postConfirmationUrl;

    @JsonProperty("notify_subscribe_email")
    String notifySubscribeEmail;

    @JsonProperty("notify_unsubscribe_email")
    String notifyUnsubscribeEmail;

    @JsonProperty("bcc")
    List<String> bcc;

    @JsonProperty("email_count")
    int emailCount;

    @JsonProperty("active_subscriber_count")
    int activeSubscriberCount;

    @JsonProperty("unsubscribed_subscriber_count")
    int unsubscribedSubscriberCount;

    @JsonProperty("email_opon_rate")
    float emailOpenRate;

    @JsonProperty("email_click_rate")
    float emailClickRate;

    @JsonProperty("created_at")
    Date createdAt;

    @JsonProperty("href")
    String href;

}
