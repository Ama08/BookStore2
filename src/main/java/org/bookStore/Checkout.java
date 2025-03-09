package org.bookStore;

public class Checkout {

    public double calculatePrice(Basket basket){
        double total = 0.0;
        int i = 0;
        int numOfBooks = 0;
        for (Book book : basket.getBooksInBasket()){
            total = total + book.getPrice();
            i++;

        }
        if (i == 3){
            total = total  * 0.99;
        }
        if (i == 7){
            total = total * 0.98;
        }
        if(i == 10){
            total *= 0.87;
        }



        return total;
    }


}
