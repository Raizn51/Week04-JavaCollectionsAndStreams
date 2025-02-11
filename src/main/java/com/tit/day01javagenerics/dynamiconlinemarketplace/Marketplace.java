package com.tit.day01javagenerics.dynamiconlinemarketplace;

import java.util.List;

// Creating a class Marketplace to display all items in the catalog regardless of their type
class Marketplace {
    public static void displayAllItemsInCatalog(List<? extends Product<?>> products) {
        for (Product<?> product : products) {
            product.displayProductDetails();
        }
    }
}
