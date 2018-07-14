package com.plant42.drip.api.impl.json;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class DripObjectMixin {

    @JsonAnySetter
    abstract void add(String key, Object value);

}
