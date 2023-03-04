package practice_9;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wijdane KHATTAT
 */
public class MapTest {
    public static void main(String[] args) {

        //créer une map pour Read only
        Map<Integer, String> map1 = Map.of(11, "casa", 2 , "safi",
                3, "safi", 6, "rabat", 5 , "rabat");
        map1.entrySet().forEach(m -> System.out.println(m.getKey()+" "+m.getValue()));

        System.out.println("\n****************");
        Map<Integer, String> map2 = Map.ofEntries(Map.entry(1, "casa"),
                Map.entry(2, "safi"), Map.entry(3, "safi"));
        for(Map.Entry<Integer, String> entry : map2.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("\n**********************");
        Product p1 = new Product("Cake");
        Product p2 = new Product("Tea");
        Product p3 = new Product("Cookies");
        Map<Product, Integer> items = new HashMap<>();
        items.put(p1,Integer.valueOf(2));
        items.put(p2,Integer.valueOf(2));
        Integer n1 = items.put(p1,Integer.valueOf(5));
        System.out.println(n1);
        Integer n11 = items.put(p3,Integer.valueOf(9));
        System.out.println(n11);
        Integer n2 = items.remove(p2);
        System.out.println(n2);
        boolean hasTea = items.containsKey(p2);
        System.out.println(hasTea);
        boolean hasTwo = items.containsValue(n1);
        System.out.println(hasTwo);
        Integer quantity = items.get(p1);
        System.out.println(quantity);

    }

}
