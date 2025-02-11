package com.tit.day01javagenerics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Creating a generic class Storage<T extends WarehouseItem> to manage the storage of items
class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    // Method to add an item to the storage
    public void addItem(T item) {
        items.add(item);
    }

    // Method to remove an item from the storage
    public void removeItem(T item) {
        items.remove(item);
    }

    // Method to get the list of items in the storage
    public List<T> getItems() {
        return items;
    }

    // Method to display all items in the storage
    public void displayAllItems() {
        for (T item : items) {
            item.displayItemDetails();
        }
    }
}
