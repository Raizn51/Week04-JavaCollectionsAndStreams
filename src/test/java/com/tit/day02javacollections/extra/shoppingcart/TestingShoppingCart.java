package com.tit.day02javacollections.extra.shoppingcart;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestingShoppingCart {

    // Test method for adding products and getting items
    @Test
    void testShoppingCart() {
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the cart
        cart.addProduct("Apple", 1.50);
        cart.addProduct("Banana", 0.75);
        cart.addProduct("Cherry", 2.00);

        // Asserting items sorted by price
        Map<String, Double> expectedItemsSortedByPrice = new TreeMap<>();
        expectedItemsSortedByPrice.put("Apple", 1.50);
        expectedItemsSortedByPrice.put("Banana", 0.75);
        expectedItemsSortedByPrice.put("Cherry", 2.00);
        assertEquals(expectedItemsSortedByPrice, cart.getItemsSortedByPrice(), "Items should be sorted by price");

        // Asserting the order of items added
        java.util.Map<String, Double> expectedItemsInOrder = new LinkedHashMap<>();
        expectedItemsInOrder.put("Apple", 1.50);
        expectedItemsInOrder.put("Banana", 0.75);
        expectedItemsInOrder.put("Cherry", 2.00);
        assertEquals(expectedItemsInOrder, cart.getItemsInOrder(), "Items should be in the order they were added");
    }
}
