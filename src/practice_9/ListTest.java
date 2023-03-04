package practice_9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Wijdane KHATTAT
 */
public class ListTest {

    public static void main(String[] args) {
        System.out.println("***********************");
        List<String> names = new ArrayList<>(8);
        System.out.println(names.size());

        System.out.println("\n***********************");
        String[] numbers = {"one", "two", "three", "four"};
        List<String> numberList = Arrays.asList(numbers);
        //numberList.add("five");  //UnsupportedOperationException
        numberList.set(3, "4");
        numberList.forEach(e-> System.out.println(e));

        System.out.println("\n***********************");
        Product p1 = new Product("chaise");
        Product p2 = new Product("placard");
        List<Product> products = List.of(p1, p2);
        Product p3 = new Product("Lit");
        //products.add(p3);
        products.get(0).setName("table");
        products.forEach(e -> System.out.println(e.getName()));

        System.out.println("\n***********************");
        List<Product> cars = new ArrayList<>();
        Product c1 = new Product("BM");
        Product c2 = new Product("RENAULT");
        cars.add(c1); //insert first element
        cars.add(c2); //insert next element
        cars.add(2, null); //insert null
        cars.add(3, c1);   //insert element
        cars.add(2, c1);   //insert element
        System.out.println(cars.size());
        cars.set(2, c2);   //update element
        cars.remove(0);    //remove element
        cars.remove(c2);   //remove element
        System.out.println(cars.size());
        boolean hasTea = cars.contains(c2);
        System.out.println(hasTea);
        cars.get(2).setName("MERCEDES");
        System.out.println(cars.size());
        //cars.add(4,c2);  //throws exception
    }
}
