package org.example.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import static java.math.RoundingMode.HALF_UP;

/**
 * @author juanq
 **/
public abstract class Product {
    public  static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private int id;
    private final String name;
    private final BigDecimal price;
    private final Rating rating;

     Product()
    {
        this(0, "no name", BigDecimal.ZERO);
    }
     Product(int id, String name, BigDecimal price) {
      this(id, name, price, Rating.NOT_RATED);
    }

     Product(int id, String coffe, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = coffe;
        this.price = price;
        this.rating = rating;
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

    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

    public BigDecimal getDiscount() {
        // discount calculation
        return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }

    public Rating getRating() {
        return rating;
    }

    public abstract Product applyRating(Rating newRating);

    @Override
    public String toString() {
        return id + ", " + name + ", " + price + ", " + getDiscount() + ", " + rating.getStars() + ", " + getBestBefore();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Product product) {
            return id == product.id && Objects.equals(name, product.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
