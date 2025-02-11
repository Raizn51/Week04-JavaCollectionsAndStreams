package com.tit.day01javagenerics.dynamiconlinemarketplace;


import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//  Creating a class TestingOnlineMarketplace for Product and its subclasses
public class TestingOnlineMarketplace
{

    private ProductCatalog<Product<?>> catalog=new ProductCatalog<>();

    @Test
    public void testAddAndRemoveBook() {
        // Creating a book product
        Product<BookCategory> book = new Book("The Great Gatsby", 15.00, BookCategory.FICTION);

        // Adding the book to the catalog
        catalog.addProduct(book);
        List<Product<?>> products = catalog.getProducts();
        assertTrue(products.contains(book));

        // Display products after addition
        System.out.println("Products in catalog after adding book:");
        catalog.displayAllProducts();

        // Removing the book from the catalog
        catalog.removeProduct(book);
        products = catalog.getProducts();
        assertFalse(products.contains(book));

        // Display products after removal
        System.out.println("Products in catalog after removing book:");
        catalog.displayAllProducts();
    }

    @Test
    public void testAddAndRemoveClothing() {
        // Creating a clothing product
        Product<ClothingCategory> shirt = new Clothing("Polo Shirt", 25.00, ClothingCategory.MENS_WEAR);

        // Adding the shirt to the catalog
        catalog.addProduct(shirt);
        List<Product<?>> products = catalog.getProducts();
        assertTrue(products.contains(shirt));

        // Display products after addition
        System.out.println("Products in catalog after adding clothing:");
        catalog.displayAllProducts();

        // Removing the shirt from the catalog
        catalog.removeProduct(shirt);
        products = catalog.getProducts();
        assertFalse(products.contains(shirt));

        // Display products after removal
        System.out.println("Products in catalog after removing clothing:");
        catalog.displayAllProducts();
    }

    @Test
    public void testAddAndRemoveGadget() {
        // Creating a gadget product
        Product<GadgetCategory> smartphone = new Gadget("iPhone", 999.00, GadgetCategory.SMARTPHONES);

        // Adding the smartphone to the catalog
        catalog.addProduct(smartphone);
        List<Product<?>> products = catalog.getProducts();
        assertTrue(products.contains(smartphone));

        // Display products after addition
        System.out.println("Products in catalog after adding gadget:");
        catalog.displayAllProducts();

        // Removing the smartphone from the catalog
        catalog.removeProduct(smartphone);
        products = catalog.getProducts();
        assertFalse(products.contains(smartphone));

        // Display products after removal
        System.out.println("Products in catalog after removing gadget:");
        catalog.displayAllProducts();
    }

    @Test
    public void testDisplayAllItemsInCatalog() {
        // Creating products
        Product<BookCategory> book = new Book("The Great Gatsby", 15.00, BookCategory.FICTION);
        Product<ClothingCategory> shirt = new Clothing("Polo Shirt", 25.00, ClothingCategory.MENS_WEAR);
        Product<GadgetCategory> smartphone = new Gadget("iPhone", 999.00, GadgetCategory.SMARTPHONES);

        // Adding products to the catalog
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(smartphone);

        // Display all products
        System.out.println("Displaying all items in the catalog:");
        List<Product<?>> allProducts = new ArrayList<>();
        allProducts.addAll(catalog.getProducts());

        Marketplace.displayAllItemsInCatalog(allProducts);

        // Assert that the total number of products is correct
        assertEquals(3, allProducts.size());
    }

    @Test
    public void testApplyDiscount() {
        // Creating a gadget product
        Product<GadgetCategory> smartphone = new Gadget("iPhone", 999.00, GadgetCategory.SMARTPHONES);

        // Adding the smartphone to the catalog
        catalog.addProduct(smartphone);

        // Apply 10% discount
        DiscountUtils.applyDiscount(smartphone, 10);

        // Assert that the price is updated correctly
        assertEquals(899.10, smartphone.getPrice(), 0.01);

        // Display products after discount
        System.out.println("Products in catalog after applying discount:");
        catalog.displayAllProducts();
    }
}

