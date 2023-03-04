package practice_11;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Wijdane KHATTAT
 */
public class Products {

    public static List<Product> getListOneOfProducts() {
        Product p1 = new Drink(3, "Tea", BigDecimal.valueOf(1.99));
        Product p2 = new Food(1, "Cake", BigDecimal.valueOf(2.99), LocalDate.now());
        List<Product> menu = new ArrayList<>();
        menu.add(p1);
        menu.add(p2);
        return menu;
    }

    public static List<Product> getListTwoOfProducts() {
        Product p1 = new Food(1, "Cookie", BigDecimal.valueOf(1.99), LocalDate.now());
        Product p2 = new Drink(2, "Coffee", BigDecimal.valueOf(1.99));
        Product p3 = new Food(2, "Cake", BigDecimal.valueOf(2.99), LocalDate.now());
        List<Product> menu = new ArrayList<>();
        menu.add(p1);
        menu.add(p2);
        menu.add(p3);
        return menu;
    }

    public static List<Product> getListThreeOfProducts() {
        Product p1 = new Drink(1, "Tea", BigDecimal.valueOf(2));
        Product p2 = new Food(2, "Cookie", BigDecimal.valueOf(2.99), LocalDate.now());
        List<Product> menu = new ArrayList<>();
        menu.add(p1);
        menu.add(p2);
        return menu;
    }

}
