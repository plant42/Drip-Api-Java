package com.plant42.drip.api.impl.json;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class WorkflowMixin extends DripObjectMixin {


    @JsonCreator
    public WorkflowMixin(
        @JsonProperty("id") Long id)
    {}

    @JsonProperty("href")
    String href;

    @JsonProperty("name")
    String name;

    @JsonProperty("status")
    String status;

    @JsonProperty("created_at")
    Date createdAt;


}
