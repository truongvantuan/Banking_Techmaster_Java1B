package vn.techmaster.Banking;

import java.util.Date;

public class Account {
    /**
     * Data fields
     */
    static final String CURRENCY = "VND";
    private String id;
    private String customerName;
    private String accountNumber;
    private java.util.Date dateCreated;

    /**
     * Constructors
     */
    public Account() {
        this.id = "";
        this.customerName = "";
        this.accountNumber = "";
        this.dateCreated = BankMethods.parseDate("16:20:15 15-5-2020");
    }

    public Account(String customerName, String id) {
        this.id = id;
        this.customerName = customerName.toUpperCase();
        this.accountNumber = BankMethods.generateAccNumber();
        this.dateCreated = BankMethods.parseDate("16:20:15 20-2-2020");
    }

    public static String getCURRENCY() {
        return CURRENCY;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName.toUpperCase();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
