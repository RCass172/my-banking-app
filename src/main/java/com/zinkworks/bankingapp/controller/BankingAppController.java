package com.zinkworks.bankingapp.controller;

import com.zinkworks.bankingapp.service.MyBank;
import com.zinkworks.pojo.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingAppController {
    @Autowired
    private MyBank myBank;
//
//    @GetMapping("/bank")
//    public String bank(BankAccount bankAccount) {
//        return myBank.showMenu(bankAccount);
//    }



    @PostMapping("/balance")
    public BankAccount bank(@RequestBody BankAccount bankAccount) {
        return myBank.balance(bankAccount);
    }

    @GetMapping("/test")
    public String test() {
        return "all good";
    }

}
