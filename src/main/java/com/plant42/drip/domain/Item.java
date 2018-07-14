package com.plant42.drip.domain;

public class Item {

    private String name;
    private int amount;
    private int price;
    private int tax;
    private int fees;
    private int discount;
    private int quantity;
    private String productId;
    private String upstreamId;
    private String upstreamProductId;
    private String upstreamProductVariantId;
    private String sku;
    private boolean taxable;

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUpstreamId() {
        return upstreamId;
    }

    public void setUpstreamId(String upstreamId) {
        this.upstreamId = upstreamId;
    }

    public String getUpstreamProductId() {
        return upstreamProductId;
    }

    public void setUpstreamProductId(String upstreamProductId) {
        this.upstreamProductId = upstreamProductId;
    }

    public String getUpstreamProductVariantId() {
        return upstreamProductVariantId;
    }

    public void setUpstreamProductVariantId(String upstreamProductVariantId) {
        this.upstreamProductVariantId = upstreamProductVariantId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", tax=" + tax +
                ", fees=" + fees +
                ", discount=" + discount +
                ", quantity=" + quantity +
                ", productId='" + productId + '\'' +
                ", upstreamId='" + upstreamId + '\'' +
                ", upstreamProductId='" + upstreamProductId + '\'' +
                ", upstreamProductVariantId='" + upstreamProductVariantId + '\'' +
                ", sku='" + sku + '\'' +
                ", taxable=" + taxable +
                '}';
    }
}
