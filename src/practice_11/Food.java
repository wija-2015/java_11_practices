package practice_11;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Wijdane KHATTAT
 */
public class Food extends Product {

    private LocalDate bestBefore;

    public String  field ="food";

    public Food() {
    }

    public Food(int id, String name, BigDecimal price, LocalDate bestBefore) {
        super(id, name, price);
        this.bestBefore = bestBefore;
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
        //return super.getPrice().multiply(BigDecimal.valueOf(3));
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }

    /*public static void myMeth(){
        System.out.println("myMeth statc");
    }*/
}
