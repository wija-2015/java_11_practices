package practice_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * {@code Product} class represents properties and behaviours of
 * product objects
 * <br>
 * Each product has an id, name and price
 * @version 4.0
 * @author Wijdane KHATTAT
 */
public class Product {

    private final int id;
    private final String name;
    private final BigDecimal price;

    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    private Rating rating;

    public Product() {
        this(0, "No name", BigDecimal.ZERO);
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    /*public void setName(final String name) {
        this.name = name;
    }*/

    public int getId() {
        return id;
    }

    /*public void setId(final int id) {
        this.id = id;
    }*/

    public BigDecimal getPrice() {
        return price;
    }

    /*public void setPrice(final BigDecimal price) {
        //price = BigDecimal.ONE;
        this.price = price;
    }*/

    /**
     * Calculates discount based on a product price and
     * {@link DISCOUNT_RATE discount rate}
     * <br>
     * Discount rate is 10
     * @return {@link BigDecimal BigDecimal}
     * value of discount
     */
    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    public Rating getRating() {
        return rating;
    }

    public Product applyRating(Rating newRating){
        return new Product(id, name, price, newRating);
    }
}
