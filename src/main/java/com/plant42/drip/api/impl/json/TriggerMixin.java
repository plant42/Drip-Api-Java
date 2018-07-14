package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.plant42.drip.domain.RequiredAction;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TriggerMixin extends DripObjectMixin {


    @JsonCreator
    public TriggerMixin(
        @JsonProperty("id") Long id)
    {}

    @JsonProperty("type")
    String type;

    @JsonProperty("trigger_type")
    String triggertype;

    @JsonProperty("provider")
    String provider;

    @JsonProperty("properties")
    Map<String,String> properties;

    @JsonProperty("actions_required")
    List<RequiredAction> actionsRequired;

}
