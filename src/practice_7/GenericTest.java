package practice_7;

import practice_6.Food;

/**
 * @author Wijdane KHATTAT
 */
public class GenericTest {

    public static void main(String[] args) {
        Some some = new Some();
        some.setValue("value x");
        some.setValue(100);
        //some.setValue(new Food());
        System.out.println(some.getValue());


        SomeG<String> someGeneric = new SomeG<>();
        someGeneric.setValue("test");
        //someGeneric.setValue(100);
    }
}
