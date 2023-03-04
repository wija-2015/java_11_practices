package practice_10;

import java.math.BigDecimal;

/**
 * @author Wijdane KHATTAT
 */
public class Product {
    private int id;
    private String name;
    private BigDecimal price;


    protected static String field = "product";

    public Product() {
    }
    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
    public Product(int id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    protected String myMeth(){
        return field;
    }



}
