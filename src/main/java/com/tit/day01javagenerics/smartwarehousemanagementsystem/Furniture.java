package com.tit.day01javagenerics.smartwarehousemanagementsystem;

// Creating a class Furniture that extends WarehouseItem
class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Furniture - Name: " + getName() + ", Price: " + getPrice() + ", Material: " + material);
    }
}
