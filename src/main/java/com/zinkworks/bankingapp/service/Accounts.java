package com.zinkworks.bankingapp.service;

import com.zinkworks.pojo.BankAccount;

import java.util.ArrayList;

public class Accounts {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    BankAccount customerOne = new BankAccount("Ruth", "122",125000);
    BankAccount customerTwo = new BankAccount("James", "124",125000);
    BankAccount customerThree = new BankAccount("Beth", "125",125000);
    BankAccount customerFour = new BankAccount("Liam", "126",125000);
    BankAccount customerFive = new BankAccount("Shirley", "127",125000);


    public void addAccount(String customerName, String customerId, int balance) {
        accounts.add(customerOne);
        accounts.add(customerTwo);
        accounts.add(customerThree);
        accounts.add(customerFour);
        accounts.add(customerFive);
    }

}
