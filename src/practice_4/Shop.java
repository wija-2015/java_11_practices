package practice_4;

import practice_5.Rating;

import java.math.BigDecimal;

/**
 * {@code Shop} class represents an app for managing products
 * @version 4.0
 * @author Wijdane KHATTAT
 */
public class Shop {
    public static void main(String[] args) {
        //4.1 Create the Product Management Application
        /*Product p1 = new Product();
        p1.setId(101);
        p1.setName("Tea");
        p1.setPrice(BigDecimal.valueOf(1.99));
        System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPrice());

        //4.2Enhance the product class
        System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPrice()+" "+p1.getDiscount());*/

        //4.3 Static initializer vs instance initializer
        System.out.println("\n************************");
        Initializer initializer1 = new Initializer();
        Initializer initializer2 = new Initializer();

        //4.4 Document Classes : Tools => Generate JavaDoc
        /*System.out.println("\n***************************");
        initializer2.setValue();
        initializer2.setValue(1, 2);
        int x = 30;
        initializer2.setValue(x);
        System.out.println(30);*/

    }
}