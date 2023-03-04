package practice_4;

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

    private int id;
    private String name;
    private final BigDecimal price;

    /**
     * A constant that defines
     *{@link java.math.BigDecimal BigDecimal} value of the discount rate
     * <br>
     * Discount rate is 10
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    public Product(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Calculates discount based on a product price and
     * {@link DISCOUNT_RATE discount rate}
     * <br>
     * Discount rate is 10
     * @return {@link java.math.BigDecimal BigDecimal}
     * value of discount
     */
    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }


}
