package practice_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Wijdane KHATTAT
 */
public class SetTest {

    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        Product p1 = new Product("chaise");
        Product p2 = new Product("placard");
        Product p3 = new Product("chaise");
        products.add(null);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        System.out.println(products.size());
        products.add(p3);
        System.out.println(products.size());
        products.remove(p1);
        products.remove(p1);
        //products.forEach(s -> System.out.println(s.getName()));
        boolean hasPlacard = products.contains(p2);
        System.out.println(hasPlacard);

        System.out.println("\n************************");
        List<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p1);
        list.add(p1);
        System.out.println(list.size());
        Set<Product> set = new HashSet<>(list);
        System.out.println(set.size());

    }
}
