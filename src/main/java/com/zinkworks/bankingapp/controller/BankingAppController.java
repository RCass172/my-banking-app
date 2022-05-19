package main.java.com.zinkworks.bankingapp.controller;

import com.zinkworks.bankingapp.service.MyBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingAppController {
    @Autowired
    private MyBank myBank;

    @GetMapping("/bank")
    public String bank(String cname, String cid) {
        return myBank.showMenu(cname, cid);
    }

}
