package com.plant42.drip.api.enums;


import com.fasterxml.jackson.core.type.TypeReference;
import com.plant42.drip.domain.*;

import java.util.List;

public enum Route {
    ACCOUNTS("accounts", false, Account[].class, new TypeReference<List<Account>>() {}),
    BROADCASTS("broadcasts", false, Broadcast[].class, new TypeReference<List<Broadcast>>() {}),
    CAMPAIGNS("campaigns", false, Campaign[].class, new TypeReference<List<Campaign>>() {}),
    CONVERSIONS("conversions", false, Conversion[].class, new TypeReference<List<Conversion>>() {}),
    FORMS("forms", false, Form[].class, new TypeReference<List<Form>>() {}),
    WORKFLOWS("workflows", false, Workflow[].class, new TypeReference<List<Workflow>>() {}),
    WEBHOOKS("webhooks", false, Webhook[].class, new TypeReference<List<Webhook>>() {}),
    TRIGGERS("triggers", false, Trigger[].class, new TypeReference<List<Trigger>>() {}),
    DELETE(null, false, null, null),
    SUBSCRIBERS("subscribers", false, Subscriber[].class, new TypeReference<List<Subscriber>>() {}),
    USER("users", false, User[].class, new TypeReference<List<User>>() {}),
    CUSTOM_FIELDS("custom_field_identifiers", false, String[].class, new TypeReference<List<String>>() {}),
    TAGS("tags", false, String[].class, new TypeReference<List<String>>() {}),
    EVENT_ACTIONS("event_actions", false, String[].class, new TypeReference<List<String>>() {}),
    CAMPAIGN_SUBSCRIBERS("subscribers", false, Subscriber[].class, new TypeReference<List<Subscriber>>() {}),
    SUBSCRIBER_CAMPAIGNS("campaign_subscriptions", false, Campaign[].class, new TypeReference<List<Campaign>>() {}),
    LINKS("links", false, Link[].class, new TypeReference<List<Link>>() {});

    //LIST_INBOX(null, false,InboxItem[].class, new TypeReference<List<InboxItem>>() {})

    /*
    //== authentication
    LOGIN(null, false, AuthenticationToken.class, new TypeReference<AuthenticationToken>() {}),
    SIGNUP(null, false, User.class, new TypeReference<User>() {}),
    LOGOUT(null, false, null, null),
    EMAIL_CONFIRMATION(null, false, null, null),
    UPDATE_DEVICE_TOKEN(null, false, null, null),


    //== USER
    ME("me", true, User.class, new TypeReference<User>() {}),
    COMPANY("company", true, Company.class, new TypeReference<Company>() {}),
    INVOICE("invoice", true, Invoice.class, new TypeReference<Invoice>() {}),
    RECEIPT("receipt", true, Receipt.class, new TypeReference<Receipt>() {}),
    EXPENSE_REPORT("expenseReport", true, ExpenseReport.class, new TypeReference<ExpenseReport>() {}),
    UPDATE_CURRENT_USER("updateCurrentUser", true, User.class, new TypeReference<User>() {}),

    //== Receipts
    RECEIPT_CREATE("createReceipt", true, Receipt.class, new TypeReference<Receipt>() {}),
    RECEIPT_UPDATE("updateReceipt", true, Receipt.class, new TypeReference<Receipt>() {}),
    RECEIPT_DELETE(null, false, Receipt.class, new TypeReference<Receipt>() {}),

    //== Invoice
    INVOICE_UPDATE("updateInvoice", true, Invoice.class, new TypeReference<Invoice>() {}),
    INVOICE_UPDATE_LEDGER_ENTRY("updateInvoiceLedgerEntry", true, LedgerEntry.class, new TypeReference<LedgerEntry>() {}),
    INVOICE_CREATE("createInvoice", true, Invoice.class, new TypeReference<Invoice>() {}),
    INVOICE_DELETE(null, false, Invoice.class, new TypeReference<Invoice>() {}),
    INVOICE_PAGE_CREATE("createInvoicePage", true, InvoicePage.class, new TypeReference<InvoicePage>() {}),

    //== Vendor
    VENDOR_CREATE("createVendor", true, Vendor.class, new TypeReference<Vendor>() {}),


    //== EXPENSE REPORS
    EXPENSE_REPORT_CREATE(null, false, ExpenseReport.class, new TypeReference<ExpenseReport>() {}),
    EXPENSE_REPORT_UPDATE(null, false, ExpenseReport.class, new TypeReference<ExpenseReport>() {}),
    EXPENSE_REPORT_DELETE(null, false, ExpenseReport.class, new TypeReference<ExpenseReport>() {}),
    EXPENSE_REPORT_SEND_FOR_APPROVAL(null, false, ExpenseReport.class, new TypeReference<ExpenseReport>() {}),

    //== LISTS
    LIST_APPROVERS("company", true, Company.class, null),
    ERROR(null, false, VicError.class, null),
    MARK_AS_READ(null, false, null, null),
    LIST_INBOX(null, false, InboxItem[].class, new TypeReference<List<InboxItem>>() {})
    ;

  */
    private final boolean unwrap;
    private final String rootName;
    private final Class rootClass;
    private final TypeReference type;

    Route(String rootName, boolean unwrap, Class rootClass, TypeReference type) {
        this.rootName = rootName;
        this.unwrap = unwrap;
        this.rootClass = rootClass;
        this.type = type;
    }

    public String getRootName() {
        return this.rootName;
    }

    public boolean getUnwrap() {
        return this.unwrap;
    }

    public <T> Class<T> getRootClass() {
        return this.rootClass;
    }

    public TypeReference getType() {
        return this.type;
    }

}
