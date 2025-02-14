package com.tit.day02javacollections.extra.shoppingcart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Creating a class ShoppingCart to manage a shopping cart
public class ShoppingCart {
    private Map<String, Double> prices = new HashMap<>();
    private Map<String, Double> items = new LinkedHashMap<>();

    // Method to add a product and its price to the shopping cart
    public void addProduct(String product, double price) {
        prices.put(product, price);
        items.put(product, price);
    }

    // Method to get items sorted by price
    public Map<String, Double> getItemsSortedByPrice() {
        return new TreeMap<>(items);
    }

    // Method to get the order of items added
    public Map<String, Double> getItemsInOrder() {
        return new LinkedHashMap<>(items);
    }
}
