package vn.techmaster.Banking;

import java.util.Date;

public class Transaction {

    // Data fields
    private Date date;
    private String type;
    private double amount;
    private double balance;
    private String description;

    /**
     * Constructor tạo giao dịch ngân hàng
     */
    public Transaction(String type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    /**
     * In ra giao dịch ngân hàng
     */
    public void printTransaction() {
        System.out.printf("%20s%15s%15.2f%15.2f%35s\n",
                BankMethods.convertDetailDate(this.date),
                getType(),
                getAmount(),
                getBalance(),
                getDescription());
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
