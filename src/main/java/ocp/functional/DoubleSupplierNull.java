package ocp.functional;

import java.util.function.DoubleSupplier;

/**
 * Created by dia on 16.9.2017 г..
 */
public class DoubleSupplierNull {
public static void main(String[] args) {
    Book b1 = new Book("Java in 24 hrs", null);
    DoubleSupplier ds1 = b1::getPrice;
    System.out.println(b1.getTitle()+" "+ds1.getAsDouble());//NullPointerException
}

    static class Book{
        public String getTitle() {
            return title;
        }

        private String title;

        public Double getPrice() {
            return price;
        }

        private Double price;
        public Book(String title, Double price){
            this.title = title;
            this.price = price;
        }
        //accessor methods not shown



    }




    }
