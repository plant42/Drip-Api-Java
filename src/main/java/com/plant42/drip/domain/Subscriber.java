package com.plant42.drip.domain;

import java.util.Date;
import java.util.Map;

public class Subscriber {

    private String id;
    private String status;
    private String email;
    private String euConsent;
    private String timezone;
    private int utcOffset;
    private String visitorUUID;
    private Map<String, String> customFields;
    private String ipAddress;
    private String userAgent;
    private String originalReferrer;
    private String landingUrl;
    private boolean prospect;
    private int leadScore;
    private int lifetimeValue;
    private Date createdAt;
    private String href;
    private String userId;
    private int baseLeadScore;

    public Subscriber() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEuConsent() {
        return euConsent;
    }

    public void setEuConsent(String euConsent) {
        this.euConsent = euConsent;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getVisitorUUID() {
        return visitorUUID;
    }

    public void setVisitorUUID(String visitorUUID) {
        this.visitorUUID = visitorUUID;
    }

    public Map<String, String> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Map<String, String> customFields) {
        this.customFields = customFields;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getOriginalReferrer() {
        return originalReferrer;
    }

    public void setOriginalReferrer(String originalReferrer) {
        this.originalReferrer = originalReferrer;
    }

    public String getLandingUrl() {
        return landingUrl;
    }

    public void setLandingUrl(String landingUrl) {
        this.landingUrl = landingUrl;
    }

    public boolean isProspect() {
        return prospect;
    }

    public void setProspect(boolean prospect) {
        this.prospect = prospect;
    }

    public int getLeadScore() {
        return leadScore;
    }

    public void setLeadScore(int leadScore) {
        this.leadScore = leadScore;
    }

    public int getLifetimeValue() {
        return lifetimeValue;
    }

    public void setLifetimeValue(int lifetimeValue) {
        this.lifetimeValue = lifetimeValue;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getBaseLeadScore() {
        return baseLeadScore;
    }

    public void setBaseLeadScore(int baseLeadScore) {
        this.baseLeadScore = baseLeadScore;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", email='" + email + '\'' +
                ", euConsent='" + euConsent + '\'' +
                ", timezone='" + timezone + '\'' +
                ", utcOffset=" + utcOffset +
                ", visitorUUID='" + visitorUUID + '\'' +
                ", customFields=" + customFields +
                ", ipAddress='" + ipAddress + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", originalReferrer='" + originalReferrer + '\'' +
                ", landingUrl='" + landingUrl + '\'' +
                ", prospect=" + prospect +
                ", leadScore=" + leadScore +
                ", lifetimeValue=" + lifetimeValue +
                ", createdAt=" + createdAt +
                ", href='" + href + '\'' +
                ", userId='" + userId + '\'' +
                ", baseLeadScore=" + baseLeadScore +
                '}';
    }
}
