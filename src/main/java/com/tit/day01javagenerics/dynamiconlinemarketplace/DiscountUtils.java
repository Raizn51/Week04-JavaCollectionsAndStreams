package com.tit.day01javagenerics.dynamiconlinemarketplace;

// Creating a class DiscountUtils to apply discounts to products
public class DiscountUtils {
    public static <T> void applyDiscount(Product<T> product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}
