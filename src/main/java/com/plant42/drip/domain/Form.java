package com.plant42.drip.domain;

import java.util.Date;
import java.util.List;

public class Form {

    private String id;
    private String href;
    private String headline;
    private String description;
    private String buttonText;
    private String confirmationHeading;
    private String confirmationText;
    private boolean sendGAEvent;
    private int secondsBeforePopup;
    private int daysBetweenPopup;
    private int daysBetweenPopupAterClose;
    private String orientation;
    private float opacity;
    private boolean showLabels;
    private String primaryColor;
    private String secondaryColor;
    private boolean widgetEnabled;
    private List<String> whitelist;
    private List<String> blacklist;
    private boolean whitelistEnabled;
    private boolean blacklistEnabled;
    private boolean hideOnMobile;
    private boolean isEmbeddable;
    private Date createdAt;

    public Form() {
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

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getConfirmationHeading() {
        return confirmationHeading;
    }

    public void setConfirmationHeading(String confirmationHeading) {
        this.confirmationHeading = confirmationHeading;
    }

    public String getConfirmationText() {
        return confirmationText;
    }

    public void setConfirmationText(String confirmationText) {
        this.confirmationText = confirmationText;
    }

    public boolean isSendGAEvent() {
        return sendGAEvent;
    }

    public void setSendGAEvent(boolean sendGAEvent) {
        this.sendGAEvent = sendGAEvent;
    }

    public int getSecondsBeforePopup() {
        return secondsBeforePopup;
    }

    public void setSecondsBeforePopup(int secondsBeforePopup) {
        this.secondsBeforePopup = secondsBeforePopup;
    }

    public int getDaysBetweenPopup() {
        return daysBetweenPopup;
    }

    public void setDaysBetweenPopup(int daysBetweenPopup) {
        this.daysBetweenPopup = daysBetweenPopup;
    }

    public int getDaysBetweenPopupAterClose() {
        return daysBetweenPopupAterClose;
    }

    public void setDaysBetweenPopupAterClose(int daysBetweenPopupAterClose) {
        this.daysBetweenPopupAterClose = daysBetweenPopupAterClose;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public float getOpacity() {
        return opacity;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

    public boolean isShowLabels() {
        return showLabels;
    }

    public void setShowLabels(boolean showLabels) {
        this.showLabels = showLabels;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public boolean isWidgetEnabled() {
        return widgetEnabled;
    }

    public void setWidgetEnabled(boolean widgetEnabled) {
        this.widgetEnabled = widgetEnabled;
    }

    public List<String> getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(List<String> whitelist) {
        this.whitelist = whitelist;
    }

    public List<String> getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(List<String> blacklist) {
        this.blacklist = blacklist;
    }

    public boolean isWhitelistEnabled() {
        return whitelistEnabled;
    }

    public void setWhitelistEnabled(boolean whitelistEnabled) {
        this.whitelistEnabled = whitelistEnabled;
    }

    public boolean isBlacklistEnabled() {
        return blacklistEnabled;
    }

    public void setBlacklistEnabled(boolean blacklistEnabled) {
        this.blacklistEnabled = blacklistEnabled;
    }

    public boolean isHideOnMobile() {
        return hideOnMobile;
    }

    public void setHideOnMobile(boolean hideOnMobile) {
        this.hideOnMobile = hideOnMobile;
    }

    public boolean isEmbeddable() {
        return isEmbeddable;
    }

    public void setEmbeddable(boolean embeddable) {
        isEmbeddable = embeddable;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id='" + id + '\'' +
                ", href='" + href + '\'' +
                ", headline='" + headline + '\'' +
                ", description='" + description + '\'' +
                ", buttonText='" + buttonText + '\'' +
                ", confirmationHeading='" + confirmationHeading + '\'' +
                ", confirmationText='" + confirmationText + '\'' +
                ", sendGAEvent=" + sendGAEvent +
                ", secondsBeforePopup=" + secondsBeforePopup +
                ", daysBetweenPopup=" + daysBetweenPopup +
                ", daysBetweenPopupAterClose=" + daysBetweenPopupAterClose +
                ", orientation='" + orientation + '\'' +
                ", opacity=" + opacity +
                ", showLabels=" + showLabels +
                ", primaryColor='" + primaryColor + '\'' +
                ", secondaryColor='" + secondaryColor + '\'' +
                ", widgetEnabled=" + widgetEnabled +
                ", whitelist=" + whitelist +
                ", blacklist=" + blacklist +
                ", whitelistEnabled=" + whitelistEnabled +
                ", blacklistEnabled=" + blacklistEnabled +
                ", hideOnMobile=" + hideOnMobile +
                ", isEmbeddable=" + isEmbeddable +
                ", createdAt=" + createdAt +
                '}';
    }
}
