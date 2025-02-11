package com.tit.day01javagenerics.smartwarehousemanagementsystem;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

class TestingWarehouseManagement
{

    private Storage<Electronics> electronicsStorage = new Storage<>();
    private Storage<Groceries> groceriesStorage = new Storage<>();
    private Storage<Furniture> furnitureStorage = new Storage<>();


    @Test
    public void testElectronicsStorage() {
        Electronics laptop = new Electronics("Laptop", 1200.00, "Dell");
        electronicsStorage.addItem(laptop);
        List<Electronics> items = electronicsStorage.getItems();
        assertTrue(items.contains(laptop));

        // Display items after addition
        System.out.println("Items in Electronics Storage after addition:");
        electronicsStorage.displayAllItems();

        electronicsStorage.removeItem(laptop);
        items = electronicsStorage.getItems();
        assertFalse(items.contains(laptop));

        // Display items after removal
        System.out.println("Items in Electronics Storage after removal:");
        electronicsStorage.displayAllItems();
    }

    @Test
    public void testGroceriesStorage()
    {
        Groceries milk = new Groceries("Milk", 2.50, "2025-02-15","2025-01-15");
        groceriesStorage.addItem(milk);
        List<Groceries> items = groceriesStorage.getItems();
        assertTrue(items.contains(milk));

        // Display items after addition
        System.out.println("Items in Groceries Storage after addition:");
        groceriesStorage.displayAllItems();

        groceriesStorage.removeItem(milk);
        items = groceriesStorage.getItems();
        assertFalse(items.contains(milk));

        // Display items after removal
        System.out.println("Items in Groceries Storage after removal:");
        groceriesStorage.displayAllItems();
    }

    @Test
    public void testFurnitureStorage() {
        Furniture chair = new Furniture("Chair", 50.00, "Wood");
        furnitureStorage.addItem(chair);
        List<Furniture> items = furnitureStorage.getItems();
        assertTrue(items.contains(chair));

        // Display items after addition
        System.out.println("Items in Furniture Storage after addition:");
        furnitureStorage.displayAllItems();

        furnitureStorage.removeItem(chair);
        items = furnitureStorage.getItems();
        assertFalse(items.contains(chair));

        // Display items after removal
        System.out.println("Items in Furniture Storage after removal:");
        furnitureStorage.displayAllItems();
    }

    @Test
    public void testDisplayAllItemsInWarehouse() {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 1200.00, "Dell"));
        electronicsStorage.addItem(new Electronics("Smartphone", 800.00, "Samsung"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Milk", 2.50, "2025-02-15","2025-01-15"));
        groceriesStorage.addItem(new Groceries("Bread", 1.20, "2025-02-10","2025-01-15"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 50.00, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 120.00, "Metal"));

        List<WarehouseItem> allItems = new ArrayList<>();
        allItems.addAll(electronicsStorage.getItems());
        allItems.addAll(groceriesStorage.getItems());
        allItems.addAll(furnitureStorage.getItems());

        // Check if all items from different storages are added
        assertEquals(6, allItems.size());

        // Display all items in the warehouse
        Warehouse.displayAllItemsInStorage(allItems);
    }
}
