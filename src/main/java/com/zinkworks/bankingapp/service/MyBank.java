package com.zinkworks.bankingapp.service;

public interface MyBank {
    void deposit(int amount);
    void withdraw(int withdrawal);
    void interest(int years);
    void getPrevTransaction();
    String showMenu(String cname, String cid);
}
