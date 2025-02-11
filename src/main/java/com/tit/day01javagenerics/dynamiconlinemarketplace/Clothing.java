package com.tit.day01javagenerics.dynamiconlinemarketplace;

// Creating a class Clothing that extends Product
class Clothing extends Product<ClothingCategory> {
    public Clothing(String name, double price, ClothingCategory category) {
        super(name, price, category);
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Clothing - Name: " + getName() + ", Price: " + getPrice() + ", Category: " + getCategory());
    }
}
