package com.zinkworks.pojo;

public class BankAccount {
    private int balance;
    private int prevTransaction;
    private String customerName;
    private String customerId;

    public BankAccount() {}

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPrevTransaction() {
        return prevTransaction;
    }

    public void setPrevTransaction(int prevTransaction) {
        this.prevTransaction = prevTransaction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
