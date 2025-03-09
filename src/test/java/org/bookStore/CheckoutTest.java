package org.bookStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTest {

    Checkout checkout;
    Basket basket;
    @BeforeEach
    void setUp() throws Exception{
        checkout = new Checkout();
        basket = new Basket();
    }
    @Test
    public void test_CalculatePrice_ReturnsDoubleZeroPountZeroWhenPassedAnEmptyBasket(){
        double price = checkout.calculatePrice(basket);

        assertEquals(0.0, price, 0.0001);
    }

    @Test
    public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
        Book book = new Book("Opal",12.95, 2564);
        basket.addBook(book);

        double price = checkout.calculatePrice(basket);
        assertEquals(12.95, price, 0.0001);
    }

    @Test
    public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBooks(){
        Book book = new Book("Order", 9.50, 2465);
        Book book2 = new Book("Mother", 12.00, 23146);

        basket.addBook(book);
        basket.addBook(book2);

        double price = checkout.calculatePrice(basket);

        assertEquals(21.5, price, 0.0001);
    }

    @Test
    public void test_CalculatePrice_ReturnsPriceOfBookInBasketMinusOnePercent_WhenPassedBasketWithThreeBooks(){
        Book book = new Book("Honey", 25.99, 1234);
        Book book2 = new Book("Bee", 25.99, 1254);
        Book book3 = new Book("Hallo", 25.99, 3629);

        basket.addBook(book);
        basket.addBook(book2);
        basket.addBook(book3);

        double price = checkout.calculatePrice(basket);

        assertEquals(77.19, price, 0.001);
    }

    @Test
    public void test_CalculatePrice_ReturnsPriceOfBookInBasketMinusTwoPercent_WhenPassedBasketWithSevenBooks(){
        Book book1 = new Book("Go", 25.99, 1356);
        Book book2 = new Book("Gina", 25.99, 2156);
        Book book3 = new Book("Lost city", 25.99, 2154);
        Book book4 = new Book("Yo",25.99, 1234);
        Book book5 = new Book("Yo",25.99, 1234);
        Book book6 = new Book("Cat in Hat", 25.99, 1234);
        Book book7 = new Book("Cat in Hat", 25.99, 1234);


        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        basket.addBook(book4);
        basket.addBook(book5);
        basket.addBook(book6);
        basket.addBook(book7);

        double price = checkout.calculatePrice(basket);

        assertEquals(178.29, price, 0.002);
    }

    @Test
    public void test_CalculatePrice_ReturnsPriceOfBookInBasketMinusThirteenPercent_WhenPassedBasketWithTenBooks(){
        Book book1 = new Book("Go", 25.99, 1356);
        Book book2 = new Book("Gina", 25.99, 2156);
        Book book3 = new Book("Lost city", 25.99, 2154);
        Book book4 = new Book("Yo",25.99, 1234);
        Book book5 = new Book("Yo",25.99, 1234);
        Book book6 = new Book("Cat in Hat", 25.99, 1234);
        Book book7 = new Book("Cat in Hat", 25.99, 1234);
        Book book8 = new Book("Haven",25.99, 1235);
        Book book9 = new Book("Not gone", 25.99, 2564);
        Book book10 = new Book("You",25.99, 2568);


        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        basket.addBook(book4);
        basket.addBook(book5);
        basket.addBook(book6);
        basket.addBook(book7);
        basket.addBook(book8);
        basket.addBook(book9);
        basket.addBook(book10);

        double price = checkout.calculatePrice(basket);

        assertEquals(226.113, price, 0.01);
    }


}
