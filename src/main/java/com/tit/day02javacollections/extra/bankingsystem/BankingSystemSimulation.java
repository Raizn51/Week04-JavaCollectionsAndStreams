package com.tit.day02javacollections.extra.bankingsystem;

/*
Implement a Banking System
Description:
HashMap stores customer accounts (AccountNumber -> Balance).
TreeMap sorts customers by balance.
Queue processes withdrawal requests.
 */

// Creating a class BankingSystemSimulation to demonstrate the BankingSystem
public class BankingSystemSimulation
{
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        // Adding accounts
        bankingSystem.addAccount("A123", 500.00);
        bankingSystem.addAccount("B456", 1500.00);
        bankingSystem.addAccount("C789", 1000.00);

        // Displaying accounts sorted by balance
        System.out.println("Accounts sorted by balance: " + bankingSystem.getAccountsSortedByBalance());

        // Requesting withdrawals
        bankingSystem.requestWithdrawal("A123");
        bankingSystem.requestWithdrawal("B456");

        // Processing withdrawals
        bankingSystem.processWithdrawal(200.00);
        bankingSystem.processWithdrawal(600.00);

        // Displaying accounts sorted by balance after withdrawals
        System.out.println("Accounts sorted by balance after withdrawals: " + bankingSystem.getAccountsSortedByBalance());
    }
}
