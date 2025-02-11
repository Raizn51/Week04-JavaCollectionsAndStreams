package com.tit.day01javagenerics.smartwarehousemanagementsystem;

// Creating a class Electronics that extends WarehouseItem
class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Electronics - Name: " + getName() + ", Price: " + getPrice() + ", Brand: " + brand);
    }
}
