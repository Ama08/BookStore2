package org.bookStore;

public class Book {

    String title;
    double price;
    int isbn;

    public Book(String title, double price, int isbn) {
        this.title = title;
        this.price = price;
        this.isbn = isbn;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
