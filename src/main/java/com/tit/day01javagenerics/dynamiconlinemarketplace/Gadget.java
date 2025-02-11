package com.tit.day01javagenerics.dynamiconlinemarketplace;

// Creating a class Gadget that extends Product
class Gadget extends Product<GadgetCategory> {
    public Gadget(String name, double price, GadgetCategory category) {
        super(name, price, category);
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Gadget - Name: " + getName() + ", Price: " + getPrice() + ", Category: " + getCategory());
    }
}
