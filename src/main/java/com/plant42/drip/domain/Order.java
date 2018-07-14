package com.plant42.drip.domain;

import java.util.Date;
import java.util.List;

public class Order {

    private String id;
    private String provider;
    private String upstreamId;
    private String identifier;
    private int amount;
    private int tax;
    private int fees;
    private int discount;
    private String permalink;
    private String currencyCode;
    private Date occurredAt;
    private Date closedAt;
    private Date cancelledAt;
    private String financialState;
    private String fulfillmentState;
    private Address billingAddress;
    private Address shippingAddress;
    private List<Item> items;

    public Order() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getUpstreamId() {
        return upstreamId;
    }

    public void setUpstreamId(String upstreamId) {
        this.upstreamId = upstreamId;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Date getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(Date occurredAt) {
        this.occurredAt = occurredAt;
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    public Date getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(Date cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public String getFinancialState() {
        return financialState;
    }

    public void setFinancialState(String financialState) {
        this.financialState = financialState;
    }

    public String getFulfillmentState() {
        return fulfillmentState;
    }

    public void setFulfillmentState(String fulfillmentState) {
        this.fulfillmentState = fulfillmentState;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", provider='" + provider + '\'' +
                ", upstreamId='" + upstreamId + '\'' +
                ", identifier='" + identifier + '\'' +
                ", amount=" + amount +
                ", tax=" + tax +
                ", fees=" + fees +
                ", discount=" + discount +
                ", permalink='" + permalink + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", occurredAt=" + occurredAt +
                ", closedAt=" + closedAt +
                ", cancelledAt=" + cancelledAt +
                ", financialState='" + financialState + '\'' +
                ", fulfillmentState='" + fulfillmentState + '\'' +
                ", billingAddress=" + billingAddress +
                ", shippingAddress=" + shippingAddress +
                ", items=" + items +
                '}';
    }
}
