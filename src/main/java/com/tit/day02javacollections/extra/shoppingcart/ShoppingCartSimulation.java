package com.tit.day02javacollections.extra.shoppingcart;
/*
Implement a Shopping Cart
Description:
Use HashMap to store product prices.
Use LinkedHashMap to maintain the order of items added.
Use TreeMap to display items sorted by price.
 */

// Creating a class ShoppingCartSimulation to demonstrate the ShoppingCart
public class ShoppingCartSimulation
{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the cart
        cart.addProduct("Apple", 1.50);
        cart.addProduct("Banana", 0.75);
        cart.addProduct("Cherry", 2.00);

        // Displaying items sorted by price
        System.out.println("Items sorted by price: " + cart.getItemsSortedByPrice());

        // Displaying the order of items added
        System.out.println("Order of items added: " + cart.getItemsInOrder());
    }
}
