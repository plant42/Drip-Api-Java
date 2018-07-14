package com.plant42.drip.domain;

import java.util.Date;

public class Broadcast {

    private String id;
    private String status;
    private String name;
    private String fromName;
    private String fromEmail;
    private String postalAddress;
    private boolean localizeSendingTime;
    private Date sendAt;
    private String bcc;
    private Date createdAt;
    private String href;
    private String subject;
    private String htmlBody;
    private String textBody;

    public Broadcast() {
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

    public boolean isLocalizeSendingTime() {
        return localizeSendingTime;
    }

    public void setLocalizeSendingTime(boolean localizeSendingTime) {
        this.localizeSendingTime = localizeSendingTime;
    }

    public Date getSendAt() {
        return sendAt;
    }

    public void setSendAt(Date sendAt) {
        this.sendAt = sendAt;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    @Override
    public String toString() {
        return "Broadcast{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", fromName='" + fromName + '\'' +
                ", fromEmail='" + fromEmail + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ", localizeSendingTime=" + localizeSendingTime +
                ", sendAt=" + sendAt +
                ", bcc=" + bcc +
                ", createdAt=" + createdAt +
                ", href='" + href + '\'' +
                ", subject='" + subject + '\'' +
                ", htmlBody='" + htmlBody + '\'' +
                ", textBody='" + textBody + '\'' +
                '}';
    }
}
