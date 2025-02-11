package com.tit.day01javagenerics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

// Creating a generic class ProductCatalog<T extends Product<?>> to manage the storage of products
class ProductCatalog<T extends Product<?>> {
    private List<T> products;

    public ProductCatalog() {
        products = new ArrayList<>();
    }

    // Method to add a product to the catalog
    public void addProduct(T product) {
        products.add(product);
    }

    // Method to remove a product from the catalog
    public void removeProduct(T product) {
        products.remove(product);
    }

    // Method to get the list of products in the catalog
    public List<T> getProducts() {
        return products;
    }

    // Method to display all products in the catalog
    public void displayAllProducts() {
        for (T product : products) {
            product.displayProductDetails();
        }
    }
}
