package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Product {

    private int id;
    private static Period defaultExpiryPeriod;
    private String name = "Tea";
    private  BigDecimal price =new BigDecimal("1.23");
    private LocalDate bestBefore = LocalDate.now().plusDays(3);
    private boolean available;
    public static final int MAX_EXPIRY_PERIOD = 5;


    {
        available = true;
    }

    static{
        defaultExpiryPeriod = Period.ofDays(3);
    }


    public static void setDefaultExpiryPeriod(int days){
        defaultExpiryPeriod = Period.ofDays(days);
        //System.out.println(name); ERROR
    }

    public static Period getDefaultExpiryPeriod() {
        return defaultExpiryPeriod;
    }

    public Product(){

    }

    public BigDecimal getDiscount(final BigDecimal discount){
        return price.multiply(discount);
    }


    public String getName() {
        if(name==null){
            String dummy = "Unknown";
            return dummy;
        }
        return name;
    }


    public BigDecimal getPrice() {
        return price;
    }


    public String consume(){
        String feedback = "Good!";
        return feedback;
    }

    public void someOperation(int param){
        var value1 = "Hello";
        var value2 = param;
        //var value3 = null; ERROR
    }


    public static void main(String[] args) {

        Period expiry = Period.ofDays(Product.MAX_EXPIRY_PERIOD);

        Product p1 = new Product();
        p1.name = "Cake";
        p1.price = new BigDecimal("2.99");

        p1.setDefaultExpiryPeriod(2);

        Product p2 = new Product();
        p2.name   = "Cookie";
        p2.price = new BigDecimal("1.99");

        System.out.println(p1.getName() + " expires in " + p1.bestBefore);
        System.out.println(p2.getName() + " expires in " + p2.bestBefore);
        System.out.println("Default period: " + defaultExpiryPeriod);
        System.out.println("Default period: " + p1.defaultExpiryPeriod);
        System.out.println("Default period: " + Product.getDefaultExpiryPeriod());
        //Product.getName(); ERROR

//    for (var i = 0; i < 10; i++) {
//      System.out.println(i);
//    }
//
//    var name = "Joe";
//    switch (name){
//      case "Joe":
//        System.out.println("Hello Joe");
//        break;
//      case "Mary":
//        System.out.println("Hello Mary");
//        break;
//      default:
//        System.out.println("Hello Stranger");
//    }



    }



}
