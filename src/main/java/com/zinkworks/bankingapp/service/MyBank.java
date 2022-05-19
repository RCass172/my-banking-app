package com.zinkworks.bankingapp.service;

import com.zinkworks.pojo.BankAccount;

public interface MyBank {
//    void deposit(int amount);
//    void withdraw(int withdrawal);
//    void interest(int years);
//    void getPrevTransaction();
//    String showMenu(BankAccount bankAccount);

     BankAccount balance(BankAccount sourceBankAccount);

}
