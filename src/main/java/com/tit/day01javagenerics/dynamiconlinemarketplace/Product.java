package com.tit.day01javagenerics.dynamiconlinemarketplace;

// Creating an abstract class Product to represent the products in the marketplace
abstract class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayProductDetails();
}
