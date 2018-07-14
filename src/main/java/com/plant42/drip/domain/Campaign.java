package com.plant42.drip.domain;

import java.util.Date;

public class Campaign {

    private String id;
    private String status;
    private String name;
    private String fromName;
    private String fromEmail;
    private String postalAddress;
    private int minutesFromMidnight;
    private boolean localizeSendingTime;
    private String daysOfTheWeekMask;
    private boolean startImmediately;
    private boolean doubleOptIn;
    private boolean sendToConfirmationPage;
    private boolean useCustomConfirmationPage;
    private String postConfirmationUrl;
    private String notifySubscribeEmail;
    private String notifyUnubscribeEmail;
    private String bcc;
    private int emailCount;
    private int activeSubscriberCount;
    private int unsubscribedSubscriberCount;
    private float emailOpenRate;
    private float emailClickRate;
    private Date createdAt;
    private String href;

    public Campaign() {
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

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public int getMinutesFromMidnight() {
        return minutesFromMidnight;
    }

    public void setMinutesFromMidnight(int minutesFromMidnight) {
        this.minutesFromMidnight = minutesFromMidnight;
    }

    public boolean isLocalizeSendingTime() {
        return localizeSendingTime;
    }

    public void setLocalizeSendingTime(boolean localizeSendingTime) {
        this.localizeSendingTime = localizeSendingTime;
    }

    public String getDaysOfTheWeekMask() {
        return daysOfTheWeekMask;
    }

    public void setDaysOfTheWeekMask(String daysOfTheWeekMask) {
        this.daysOfTheWeekMask = daysOfTheWeekMask;
    }

    public boolean isStartImmediately() {
        return startImmediately;
    }

    public void setStartImmediately(boolean startImmediately) {
        this.startImmediately = startImmediately;
    }

    public boolean isDoubleOptIn() {
        return doubleOptIn;
    }

    public void setDoubleOptIn(boolean doubleOptIn) {
        this.doubleOptIn = doubleOptIn;
    }

    public boolean isSendToConfirmationPage() {
        return sendToConfirmationPage;
    }

    public void setSendToConfirmationPage(boolean sendToConfirmationPage) {
        this.sendToConfirmationPage = sendToConfirmationPage;
    }

    public boolean isUseCustomConfirmationPage() {
        return useCustomConfirmationPage;
    }

    public void setUseCustomConfirmationPage(boolean useCustomConfirmationPage) {
        this.useCustomConfirmationPage = useCustomConfirmationPage;
    }

    public String getPostConfirmationUrl() {
        return postConfirmationUrl;
    }

    public void setPostConfirmationUrl(String postConfirmationUrl) {
        this.postConfirmationUrl = postConfirmationUrl;
    }

    public String getNotifySubscribeEmail() {
        return notifySubscribeEmail;
    }

    public void setNotifySubscribeEmail(String notifySubscribeEmail) {
        this.notifySubscribeEmail = notifySubscribeEmail;
    }

    public String getNotifyUnubscribeEmail() {
        return notifyUnubscribeEmail;
    }

    public void setNotifyUnubscribeEmail(String notifyUnubscribeEmail) {
        this.notifyUnubscribeEmail = notifyUnubscribeEmail;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public int getEmailCount() {
        return emailCount;
    }

    public void setEmailCount(int emailCount) {
        this.emailCount = emailCount;
    }

    public int getActiveSubscriberCount() {
        return activeSubscriberCount;
    }

    public void setActiveSubscriberCount(int activeSubscriberCount) {
        this.activeSubscriberCount = activeSubscriberCount;
    }

    public int getUnsubscribedSubscriberCount() {
        return unsubscribedSubscriberCount;
    }

    public void setUnsubscribedSubscriberCount(int unsubscribedSubscriberCount) {
        this.unsubscribedSubscriberCount = unsubscribedSubscriberCount;
    }

    public float getEmailOpenRate() {
        return emailOpenRate;
    }

    public void setEmailOpenRate(float emailOpenRate) {
        this.emailOpenRate = emailOpenRate;
    }

    public float getEmailClickRate() {
        return emailClickRate;
    }

    public void setEmailClickRate(float emailClickRate) {
        this.emailClickRate = emailClickRate;
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
        return "Campaign{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", fromName='" + fromName + '\'' +
                ", fromEmail='" + fromEmail + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ", minutesFromMidnight=" + minutesFromMidnight +
                ", localizeSendingTime=" + localizeSendingTime +
                ", daysOfTheWeekMask='" + daysOfTheWeekMask + '\'' +
                ", startImmediately=" + startImmediately +
                ", doubleOptIn=" + doubleOptIn +
                ", sendToConfirmationPage=" + sendToConfirmationPage +
                ", useCustomConfirmationPage=" + useCustomConfirmationPage +
                ", postConfirmationUrl='" + postConfirmationUrl + '\'' +
                ", notifySubscribeEmail='" + notifySubscribeEmail + '\'' +
                ", notifyUnubscribeEmail='" + notifyUnubscribeEmail + '\'' +
                ", bcc=" + bcc +
                ", emailCount=" + emailCount +
                ", activeSubscriberCount=" + activeSubscriberCount +
                ", unsubscribedSubscriberCount=" + unsubscribedSubscriberCount +
                ", emailOpenRate=" + emailOpenRate +
                ", emailClickRate=" + emailClickRate +
                ", createdAt=" + createdAt +
                ", href='" + href + '\'' +
                '}';
    }
}
