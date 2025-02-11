package com.tit.day01javagenerics.smartwarehousemanagementsystem;

// Creating an abstract class WarehouseItem to represent the items in the warehouse
abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayItemDetails();
}
