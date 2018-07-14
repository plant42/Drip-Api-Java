package com.plant42.drip.domain;

import java.util.Date;
import java.util.List;

public class Webhook {

    private String id;
    private String href;
    private String postUrl;
    private String version;
    private boolean includeReceivedEmail;
    private List<String> events;
    private Date createdAt;

    public Webhook() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isIncludeReceivedEmail() {
        return includeReceivedEmail;
    }

    public void setIncludeReceivedEmail(boolean includeReceivedEmail) {
        this.includeReceivedEmail = includeReceivedEmail;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Webhook{" +
                "id='" + id + '\'' +
                ", href='" + href + '\'' +
                ", postUrl='" + postUrl + '\'' +
                ", version='" + version + '\'' +
                ", includeReceivedEmail=" + includeReceivedEmail +
                ", events=" + events +
                ", createdAt=" + createdAt +
                '}';
    }
}
