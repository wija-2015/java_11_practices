package practice_6.shops;

import practice_6.*;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Wijdane KHATTAT
 */
public class Shop2 {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        //6.3 -> 4. Food & Drink Sub classes
        System.out.println("********************************");
        Product p1 = productManager.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STAR);
        Product p2 = productManager.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p3 = productManager.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        Product p4 = productManager.createProduct(105, "Cake", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());

        Product p5 = p3.applyRating(Rating.THREE_STAR);
        Product p8 = p4.applyRating(Rating.FIVE_STAR);
        Product p9 = p1.applyRating(Rating.TWO_STAR);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4.toString()); //p1.toString()
        System.out.println(p8);
        System.out.println(p9);
        Product p6 = productManager.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
        Product p7 = productManager.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR,
                LocalDate.now().plusDays(2));
        System.out.println(p6.equals(p7));
        System.out.println(p3.getBestBefore());
        System.out.println(p1.getBestBefore());



    }
}
