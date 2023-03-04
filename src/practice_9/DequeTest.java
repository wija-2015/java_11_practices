package practice_9;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Wijdane KHATTAT
 */
public class DequeTest {

    public static void main(String[] args) {

        Product p1 = new Product("chaise");
        Product p2 = new Product("placard");
        Product p3 = new Product("armoire");
        Deque<Product> menu = new ArrayDeque<>();
        Product nullProduct = menu.pollFirst();
        System.out.println(nullProduct);
        //menu.offerFirst(null);
        menu.offerFirst(p1);
        menu.offerFirst(p2);
        Product placard = menu.pollFirst();
        System.out.println(placard.getName());
        Product chaise1 = menu.peekFirst();
        System.out.println(chaise1.getName());
        menu.offerLast(p3);
        menu.offerLast(p1);
        Product chaise2 = menu.pollLast();
        System.out.println(chaise2.getName());
        Product armoire = menu.peekLast();
        System.out.println(armoire.getName());
        menu.offerLast(null);

    }
}
