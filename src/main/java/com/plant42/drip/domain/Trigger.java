package com.plant42.drip.domain;

import java.util.List;
import java.util.Map;

public class Trigger {

    private String id;
    private String type;
    private String triggerType;
    private String provider;
    private Map<String,String> properties;
    private List<RequiredAction> actionsRequired;

    public Trigger() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public List<RequiredAction> getActionsRequired() {
        return actionsRequired;
    }

    public void setActionsRequired(List<RequiredAction> actionsRequired) {
        this.actionsRequired = actionsRequired;
    }

    @Override
    public String toString() {
        return "Trigger{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", triggerType='" + triggerType + '\'' +
                ", provider='" + provider + '\'' +
                ", properties=" + properties +
                ", actionsRequired=" + actionsRequired +
                '}';
    }
}
