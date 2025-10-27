package org.example;

import java.math.BigDecimal;

public class ProductMain {

    public static void main(String[] args) {
        Product product = new Product();
        BigDecimal percentage = new BigDecimal("0.2");
        final BigDecimal amount= product.getDiscount(percentage);
        System.out.println("Discounted amount: "+amount);

    }
}
