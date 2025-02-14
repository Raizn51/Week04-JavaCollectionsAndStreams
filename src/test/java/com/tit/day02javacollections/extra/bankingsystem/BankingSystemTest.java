package com.tit.day02javacollections.extra.bankingsystem;




import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class BankingSystemTest {

    // Test method for adding accounts and processing withdrawals
    @Test
    void testBankingSystem() {
        BankingSystem bankingSystem = new BankingSystem();

        // Adding accounts
        bankingSystem.addAccount("A123", 500.00);
        bankingSystem.addAccount("B456", 1500.00);
        bankingSystem.addAccount("C789", 1000.00);

        // Asserting accounts sorted by balance
        Map<String, Double> expectedAccountsSortedByBalance = new TreeMap<>((a, b) -> 0); // Custom comparator
        expectedAccountsSortedByBalance.put("B456", 1500.00);
        expectedAccountsSortedByBalance.put("C789", 1000.00);
        expectedAccountsSortedByBalance.put("A123", 500.00);
        assertEquals(expectedAccountsSortedByBalance, bankingSystem.getAccountsSortedByBalance(), "Accounts should be sorted by balance");

        // Requesting withdrawals
        bankingSystem.requestWithdrawal("A123");
        bankingSystem.requestWithdrawal("B456");

        // Processing withdrawals
        bankingSystem.processWithdrawal(200.00); // Should succeed
        bankingSystem.processWithdrawal(600.00); // Should succeed

        // Asserting accounts sorted by balance after withdrawals
        expectedAccountsSortedByBalance.clear();
        expectedAccountsSortedByBalance.put("C789", 1000.00);
        expectedAccountsSortedByBalance.put("B456", 900.00);
        expectedAccountsSortedByBalance.put("A123", 300.00);
        assertEquals(expectedAccountsSortedByBalance, bankingSystem.getAccountsSortedByBalance(), "Accounts should be sorted by balance after withdrawals");
    }
}
