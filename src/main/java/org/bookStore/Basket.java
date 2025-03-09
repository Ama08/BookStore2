package org.bookStore;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooksInBasket() {
        return new ArrayList<>(books);
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
