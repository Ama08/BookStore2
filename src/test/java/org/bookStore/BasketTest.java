package org.bookStore;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    @Test
    public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
        Basket basket = new Basket();
        List<Book>  booksInBasket = basket.getBooksInBasket();
        assertEquals(0, booksInBasket.size());
    }

    @Test
    public void test_GetBooksInBasket_ReturnsArrayOfOne_AfterAddBookMethodIsCalledWithOneBook(){
        Basket basket = new Basket();
        Book book = new Book("Haver",10.50, 1234);
        basket.addBook(book);
        List<Book> booksInBasket = basket.getBooksInBasket();
        assertEquals(1, booksInBasket.size());
    }

    @Test
    public void test_GetBooksInBasket_ReturnsArrayOfTWO_AfterAddBookMethodIsCalledWithOneBook(){
        Basket basket = new Basket();
        Book book = new Book("Blob", 11.50, 1234);
        Book book2 = new Book("Bib", 9.26, 12354);
        basket.addBook(book);
        basket.addBook(book2);
        List<Book> booksInBasket = basket.getBooksInBasket();
        assertEquals(2, booksInBasket.size());
    }


}
