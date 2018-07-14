package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class FormMixin extends DripObjectMixin {


    @JsonCreator
    public FormMixin(
        @JsonProperty("id") Long id)
    {}

    @JsonProperty("href")
    String href;

    @JsonProperty("headline")
    String headline;

    @JsonProperty("description")
    String description;

    @JsonProperty("button_text")
    String buttonText;

    @JsonProperty("confirmation_heading")
    String confirmationHeading;

    @JsonProperty("confirmation_text")
    int confirmationText;

    @JsonProperty("send_ga_event")
    boolean sendGAEvent;

    @JsonProperty("seconds_before_popup")
    int secondsBeforePopup;

    @JsonProperty("days_between_popup")
    int daysBetweenPopup;

    @JsonProperty("days_between_popup_after_close")
    int getDaysBetweenPopupAfterClose;

    @JsonProperty("orientation")
    String orientation;

    @JsonProperty("opacity")
    float opacity;

    @JsonProperty("show_labels")
    boolean showLabels;

    @JsonProperty("primary_color")
    String primaryColor;

    @JsonProperty("secondary_color")
    String secondaryColor;

    @JsonProperty("is_widget_enabled")
    boolean widgetEnabled;

    @JsonProperty("whitelist")
    List<String> whitelist;

    @JsonProperty("blacklist")
    List<String> blacklist;

    @JsonProperty("is_whitelist_enabled")
    boolean whitelistEnabled;

    @JsonProperty("is_blacklist_enabled")
    boolean blacklistEnabled;

    @JsonProperty("hide_on_mobile")
    boolean hideOnMobile;

    @JsonProperty("is_embeddable")
    boolean isEmbeddable;

    @JsonProperty("created_at")
    Date createdAt;


}
