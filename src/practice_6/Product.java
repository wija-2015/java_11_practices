package practice_6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

/**
 * {@code Product} class represents properties and behaviours of
 * product objects
 * <br>
 * Each product has an id, name and price
 * @version 4.0
 * @author Wijdane KHATTAT
 */
public abstract class Product {

    private final int id;
    private final String name;
    private final BigDecimal price;

    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    private Rating rating;

    //6.3 3.
    /*public Product() {
        this(0, "No name", BigDecimal.ZERO);
    }
    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }*/

    Product(int id, String name, BigDecimal price, Rating rating) {
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

    /*public Product applyRating(Rating newRating){
        return new Product(id, name, price, newRating);
    }*/
    public abstract Product applyRating(Rating newRating);

    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + price + ", "+getDiscount()+", " +rating.getStars()+" "+getBestBefore();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
