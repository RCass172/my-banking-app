package com.zinkworks.bankingapp.service;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("MyBank")
public class BankAcc implements MyBank {
    // class variables
    int balance;
    int prevTransaction;
    String customerName;
    String customerId;

    public void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            prevTransaction = amount;
        }
    }

    public void withdraw(int withdrawal) {
        if (withdrawal > balance) {
            System.out.println("Sorry you don't have enough money!");
        } else {
            balance = balance - withdrawal;
            prevTransaction = -withdrawal;
        }
    }

    public void interest(int years) {
        double interestAmount = balance * .095 + balance;
        System.out.println("In " + years + " years you will have €" + interestAmount);
    }

    public void getPrevTransaction() {
        if (prevTransaction > 0) {
            System.out.println("You previously deposited: €" + prevTransaction);
        } else if (prevTransaction < 0) {
            System.out.println("You previously withdrew: €" + prevTransaction);
        } else {
            System.out.println("No previous transactions");
        }
    }

    public String showMenu(String cname, String cid) {
        customerName = cname;
        customerId = cid;
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + customerName + "!");
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A Check your balance");
        System.out.println("B Make a deposit");
        System.out.println("C Make a withdrawal");
        System.out.println("D Check previous transaction");
        System.out.println("E Calculate interest");
        System.out.println("F Exit");

        do {
            System.out.println();
            System.out.println("Please enter your selection");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);

            switch(option) {
                case 'A':
                    System.out.println("Your balance is €" + balance);
                    break;
                case 'B':
                    System.out.println("How much would you like to deposit?");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("How much would you like to withdraw?");
                    int withdrawal = scanner.nextInt();
                    withdraw(withdrawal);
                    System.out.println();
                    break;
                case 'D':
                    getPrevTransaction();
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("How many years would you like to calculate interest for?");
                    int years = scanner.nextInt();
                    interest(years);
                    break;
                case 'F':
                    System.out.println("You are now leaving your account");
                    break;
                default:
                    System.out.println("You have entered the incorrect letter");
                    break;
            }
        } while (option != 'F');
        System.out.println("Thank you for banking with us");
        return cname;
    }
}
