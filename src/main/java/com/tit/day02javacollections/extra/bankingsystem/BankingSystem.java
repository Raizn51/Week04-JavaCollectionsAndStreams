package com.tit.day02javacollections.extra.bankingsystem;

import java.util.*;

// Creating a class BankingSystem to manage banking operations
public class BankingSystem {
    private Map<String, Double> accounts = new HashMap<>();
    private Queue<String> withdrawalRequests = new LinkedList<>();

    // Method to add an account with its balance
    public void addAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }

    // Method to request a withdrawal
    public void requestWithdrawal(String accountNumber) {
        withdrawalRequests.add(accountNumber);
    }

    // Method to process a withdrawal request
    public void processWithdrawal(double amount) {
        String accountNumber = withdrawalRequests.poll();
        if (accountNumber != null) {
            double currentBalance = accounts.getOrDefault(accountNumber, 0.0);
            if (currentBalance >= amount) {
                accounts.put(accountNumber, currentBalance - amount);
                System.out.println("Processed withdrawal of " + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient funds for account " + accountNumber);
            }
        } else {
            System.out.println("No withdrawal requests in the queue");
        }
    }

    // Method to get accounts sorted by balance
    public Map<String, Double> getAccountsSortedByBalance() {
        return new TreeMap<>((a, b) -> accounts.get(b).compareTo(accounts.get(a)));
    }
}
