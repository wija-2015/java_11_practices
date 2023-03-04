package practice_10;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Wijdane KHATTAT
 */
public class LambdaTest {


    public static void main(String[] args) {
        System.out.println("************** Labmda Expressions**********************");
        Order order1 = ()-> {return BigDecimal.valueOf(30);};
        Order order2 = ()-> BigDecimal.valueOf(55);

        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
        Comparator<String> comparator2 = (String s1, String s2) -> s1.compareTo(s2);
        Comparator<String> comparator3 = (final String s1, String s2) -> s2.compareTo(s1);
        Comparator<String> comparator4 = (var s1, var s2) -> s2.compareTo(s1);

        System.out.println("************** Method References **********************");
        List<String> list = new ArrayList<>();
        list.add("AA"); list.add("BB"); list.add("CC");list.add("DD");
        Predicate<String> predicate1 = (String s) -> TextFilter.removeA(s);
        Predicate<String> predicate2 = TextFilter::removeA;
        //list.removeIf(predicate);
        list.removeIf(predicate2);         // same as the line above

        TextFilter textFilter = new TextFilter();
        Collections.sort(list, (s1,s2) -> textFilter.sortText(s1,s2));
        Collections.sort(list, textFilter::sortText);            // same as the line above
        Collections.sort(list, (s1,s2) -> s1.compareToIgnoreCase(s2));
        Collections.sort(list, String::compareToIgnoreCase); // same as the line above

        System.out.println("\n************** Comparator **********************");
        List<Product> menu = new ArrayList<>();
        menu.add(new Product("Cake", BigDecimal.valueOf(10)));
        menu.add(new Product("Cookie", BigDecimal.valueOf(15)));
        menu.add(new Product("Tea", BigDecimal.valueOf(20)));
        menu.add(new Product("Cookie", BigDecimal.valueOf(25)));
        Comparator<Product> sortNames = (p1, p2) -> p1.getName().compareTo(p2.getName());
        Comparator<Product> sortPrices = (p1, p2) -> p1.getPrice().compareTo(p2.getPrice());
        Collections.sort(menu, sortNames.thenComparing(sortPrices)); // add reverse()
        menu.forEach(p -> System.out.println(p.getName()+" "+p.getPrice()));
        System.out.println();
        menu.add(null);
        Collections.sort(menu, Comparator.nullsFirst(sortNames));
        menu.forEach(p -> System.out.println(p));
        String s = new String();
        s.compareToIgnoreCase("");


        System.out.println("\n************** Predicate **********************");
        Product p1 = new Food(1, "Pizza", BigDecimal.valueOf(1), LocalDate.now());
        Product p2 = new Food(2, "Tacos", BigDecimal.valueOf(2), LocalDate.now());
        Product p3 = new Drink(3, "Coka", BigDecimal.valueOf(6));
        Product p4 = new Drink(4, "Pepsi", BigDecimal.valueOf(8));
        List<Product> products = new ArrayList<>();
        products.add(p1); products.add(p2); products.add(p3);products.add(p4);

        Predicate<Product> foodFilter = p -> p instanceof Food;
        Predicate<Product> priceFilter = p -> p.getPrice().compareTo(BigDecimal.valueOf(2)) < 0;

        products.removeIf(foodFilter.negate().or(priceFilter));
        products.forEach(e -> System.out.println(e.getName()+ " " +e.getPrice()));

    }
}
