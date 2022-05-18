package com.zinkworks.bankingapp;

import com.zinkworks.bankingapp.service.BankAcc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingApp {
    public static void main (String... args) {
        SpringApplication.run(
                BankingApp.class, args);

        BankAcc ruth = new BankAcc("Ruth Cassidy", "A82P202");
        ruth.showMenu();
    }
}
