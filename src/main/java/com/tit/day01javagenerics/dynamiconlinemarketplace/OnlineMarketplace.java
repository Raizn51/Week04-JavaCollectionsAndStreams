package com.tit.day01javagenerics.dynamiconlinemarketplace;

/*
2. Dynamic Online Marketplace
Concepts: Type Parameters, Generic Methods, Bounded Type Parameters
Problem Statement:
Build a generic product catalog for an online marketplace that supports various product types like Books, Clothing, and Gadgets. Each product type has a specific price range and category.
Hints:
Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount(T product, double percentage)).
Ensure type safety while allowing multiple product categories to exist in the same catalog.
*/

import java.util.ArrayList;
import java.util.List;

// Creating a class OnlineMarketplace to demonstrate the functionalities of the Dynamic Online Marketplace
public class OnlineMarketplace{
    public static void main(String[] args) {
        // Creating objects of Product classes for different product types
        Product<BookCategory> book = new Book("The Great Gatsby", 15.00, BookCategory.FICTION);
        Product<ClothingCategory> shirt = new Clothing("Polo Shirt", 25.00, ClothingCategory.MENS_WEAR);
        Product<GadgetCategory> smartphone = new Gadget("iPhone", 999.00, GadgetCategory.SMARTPHONES);

        // Creating objects of ProductCatalog classes for different product types
        ProductCatalog<Product<?>> catalog = new ProductCatalog<>();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(smartphone);

        // Display all products in each category
        System.out.println("Catalog:");
        catalog.displayAllProducts();

        // Using Marketplace class to display all items from different catalogs
        System.out.println("\nDisplaying all items in the marketplace:");
        List<Product<?>> allProducts = new ArrayList<>();
        allProducts.addAll(catalog.getProducts());

        Marketplace.displayAllItemsInCatalog(allProducts);

        // Apply discounts
        DiscountUtils.applyDiscount(book, 10); // Apply 10% discount to book
        DiscountUtils.applyDiscount(shirt, 20); // Apply 20% discount to shirt
        DiscountUtils.applyDiscount(smartphone, 5); // Apply 5% discount to smartphone

        System.out.println("\nProducts after applying discounts:");
        catalog.displayAllProducts();
    }
}
