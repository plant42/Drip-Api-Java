package com.plant42.drip.domain;

import java.util.Date;

public class Conversion {

    private String id;
    private String status;
    private String name;
    private String url;
    private int defaultValue;
    private String countingMethod;
    private Date createdAt;
    private String href;

    public Conversion() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(int defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getCountingMethod() {
        return countingMethod;
    }

    public void setCountingMethod(String countingMethod) {
        this.countingMethod = countingMethod;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", defaultValue=" + defaultValue +
                ", countingMethod='" + countingMethod + '\'' +
                ", createdAt=" + createdAt +
                ", href='" + href + '\'' +
                '}';
    }
}
