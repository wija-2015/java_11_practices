package practice_9;


import java.util.*;
import java.util.stream.Stream;

/**
 * @author Wijdane KHATTAT
 */
public class CollectionsTest {

    public static void main(String[] args) {
        List<Product> menu = new ArrayList<>();
        Product p1 = new Product("placard");
        Product p2 = new Product("armoire ");
        Product p3 = new Product("chaise");
        menu.add(p1); menu.add(p2); menu.add(p3);
        menu.forEach(p -> System.out.println(p.getName()));
        Iterator<Product> iterator = menu.iterator();

        System.out.println("\n******sort********");
        Collections.sort(menu);
        //Collections.sort(menu, new ProductComaprator());
        menu.forEach(p -> System.out.println(p.getName()));

        System.out.println("\n******reverse********");
        Collections.reverse(menu);
        menu.forEach(p -> System.out.println(p.getName()));

        System.out.println("\n******shuffle********");
        Collections.shuffle(menu);
        menu.forEach(p -> System.out.println(p.getName()));

        System.out.println("\n******binarySearch********");
        int x = Collections.binarySearch(menu, p3);
        System.out.println(x);
        System.out.println(Collections.binarySearch(menu, p1));
        System.out.println(Collections.binarySearch(menu, p2));

        System.out.println("\n******fill********");
        Collections.fill(menu, new Product("table"));
        menu.forEach(p -> System.out.println(p.getName()));


    }
}
