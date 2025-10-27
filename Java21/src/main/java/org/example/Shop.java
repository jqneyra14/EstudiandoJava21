package org.example;


import static java.lang.Math.random;
import static java.time.LocalTime.now;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.ZoneId;
import java.util.Locale;
import java.util.ResourceBundle;

public class Shop {

    public static void main(String[] args) {

        Math.round(1.99);
        double value = random();

        BigDecimal.valueOf(1.99);
        now();
        ZoneId.of("Europe/London");
        ResourceBundle.getBundle("messages", Locale.UK);
        NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("Hello, World!");

//    new Product();
//    Product p1 = new Product();
//    Product p2 = new Product();
//    Product p3 = p2;
//    System.out.println(p1.getName() + " en una copa");
//    System.out.println(p2.getName() + " en un plato");
//    System.out.println(p3.getName() + " para compartir");
//    //p1.name = "Coffee"; ERROR
    }
}
