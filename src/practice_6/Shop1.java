package practice_6;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Wijdane KHATTAT
 */
public class Shop1 {
    public static void main(String[] args) {
        //6.1 -> 6. Food & Drink Sub classes
        System.out.println("********************************");
        //Product p1 = new Product(101, "Tea", BigDecimal.valueOf(1.99));
        Product p1 = new Drink(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STAR);
        Product p2 = new Drink(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p3 = new Food(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        System.out.println(p2.getId()+" "+p2.getName()+" "+p2.getPrice()+" "+p2.getDiscount()+" "+p2.getRating().getStars());
        System.out.println(p3.getId()+" "+p3.getName()+" "+p3.getPrice()+" "+p3.getDiscount()+" "+p3.getRating().getStars());

        //6.2 Override Methods and use Polymorphism -> toString()
        System.out.println("\n********************************");
        //Product p4 = new Product();
        Product p4 = new Food(105, "Cake", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4.toString()); //p1.toString()

        //6.2 -> 4 equals
        System.out.println("\n***********equals*********************");
        Product p6 = new Drink(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FOUR_STAR);
        Product p7 = new Food(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        //Product p7 = null;
        System.out.println(p6.equals(p7));

        //6.2 7.calculate discount for Food and Drink products
        System.out.println("\n********************************");
        System.out.println(p7);
        System.out.println(p6.getDiscount());
        System.out.println(p7.getDiscount());
        System.out.println(p6.DISCOUNT_RATE);
        System.out.println(p7.DISCOUNT_RATE);
        System.out.println(Product.DISCOUNT_RATE);

        //6.2 8.Fix logic of the applyRating method to be abstract
        // in Product and implements it in Food and Drink

        //6.2 9.Explore polymorphic of applyRating
        System.out.println("\n********************************");
        Product p8 = p4.applyRating(Rating.FIVE_STAR);
        Product p9 = p1.applyRating(Rating.TWO_STAR);
        System.out.println(p8);
        System.out.println(p9);

        //6.2 10.Explore non polymorphic of getBestBefore
        System.out.println("\n********************************");
        if(p3 instanceof Food){
            System.out.println(((Food)p3).getBestBefore());
        }
        System.out.println(p3.getBestBefore());
        System.out.println(p1.getBestBefore());

        //6.3 1.Create ProductManager Class
        System.out.println("\n********************************");

    }
}
