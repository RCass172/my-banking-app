package com.zinkworks.bankingapp;

import com.zinkworks.bankingapp.service.BankAcc;
import com.zinkworks.bankingapp.service.MyBank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingApp {
    public static void main (String... args) {
        SpringApplication.run(
                BankingApp.class, args);

        MyBank ruth = new BankAcc();
        ruth.showMenu("Ruth Cassidy", "A82P202");
    }
}
