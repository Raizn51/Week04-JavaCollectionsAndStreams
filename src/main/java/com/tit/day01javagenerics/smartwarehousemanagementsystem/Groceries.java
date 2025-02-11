package com.tit.day01javagenerics.smartwarehousemanagementsystem;

// Creating a class Groceries that extends WarehouseItem
class Groceries extends WarehouseItem {
    private String expiryDate;
    private String manufactureDate;

    public Groceries(String name, double price, String expiryDate, String manufactureDate) {
        super(name, price);
        this.expiryDate = expiryDate;
        this.manufactureDate = manufactureDate;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Groceries - Name: " + getName() + ", Price: " + getPrice() + ", Expiry Date: " + expiryDate + ", Manufacture Date: " + manufactureDate);
    }
}
