package com.plant42.drip.domain;

import java.util.Date;

public class Account {

    private String id;
    private String name;
    private String url;
    private String defaultFromName;
    private String defaultFromEmail;
    private String defaultPostalAddress;
    private String primaryEmail;
    private boolean enableThirdPartyCookies;
    private String phoneNumber;
    private Date createdAt;
    private String href;

    public Account() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDefaultFromName() {
        return defaultFromName;
    }

    public void setDefaultFromName(String defaultFromName) {
        this.defaultFromName = defaultFromName;
    }

    public String getDefaultFromEmail() {
        return defaultFromEmail;
    }

    public void setDefaultFromEmail(String defaultFromEmail) {
        this.defaultFromEmail = defaultFromEmail;
    }

    public String getDefaultPostalAddress() {
        return defaultPostalAddress;
    }

    public void setDefaultPostalAddress(String defaultPostalAddress) {
        this.defaultPostalAddress = defaultPostalAddress;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public boolean isEnableThirdPartyCookies() {
        return enableThirdPartyCookies;
    }

    public void setEnableThirdPartyCookies(boolean enableThirdPartyCookies) {
        this.enableThirdPartyCookies = enableThirdPartyCookies;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", defaultFromName='" + defaultFromName + '\'' +
                ", defaultFromEmail='" + defaultFromEmail + '\'' +
                ", defaultPostalAddress='" + defaultPostalAddress + '\'' +
                ", primaryEmail='" + primaryEmail + '\'' +
                ", enableThirdPartyCookies=" + enableThirdPartyCookies +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", createdAt=" + createdAt +
                ", href='" + href + '\'' +
                '}';
    }
}
