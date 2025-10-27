package org.example.data;

import java.math.BigDecimal;

/**
 * @author juanq
 **/
public class Product {

    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    private final int id;
    private final String name;
    private final BigDecimal price;
    private Rating rating;

    public Product(){
        this(0, "no name", BigDecimal.ZERO);
    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }


    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }

    public Product applyRating(Rating newRating){
        return new Product(id, name, price, newRating);
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }


    public Rating getRating() {
        return rating;
    }



}
