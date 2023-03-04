package practice_10;

import java.math.BigDecimal;

/**
 * @author Wijdane KHATTAT
 */
public class Drink extends Product {

    public Drink(int id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public BigDecimal getPrice() {
        //return super.getPrice().multiply(BigDecimal.valueOf(2));
        return super.getPrice();
    }

    public void showInfo(String s){
        System.out.println(super.getId()+" "+this.getName()+" "+getPrice()+" "+s);
    }
}
