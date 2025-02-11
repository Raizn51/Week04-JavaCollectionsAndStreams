package com.tit.day01javagenerics.dynamiconlinemarketplace;

// Creating a class Book that extends Product
class Book extends Product<BookCategory> {
    public Book(String name, double price, BookCategory category) {
        super(name, price, category);
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Book - Name: " + getName() + ", Price: " + getPrice() + ", Category: " + getCategory());
    }
}
