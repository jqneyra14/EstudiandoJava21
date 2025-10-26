package org.example;


import java.math.BigDecimal;
import pe.joedayz.labs.pm.data.Product;
import pe.joedayz.labs.pm.data.Rating;
/**
 * @author juanq
 **/
public class Shop {

    public static void main(String... args) {

        Product p1 = new Product(101, "Tea", BigDecimal.valueOf(1.99));
        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount()
                + " " + p1.getRating().getStars());

    }
}