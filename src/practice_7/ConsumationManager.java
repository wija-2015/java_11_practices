package practice_7;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Wijdane KHATTAT
 */
public class ConsumationManager {

    public static void main(String[] args) throws CloneNotSupportedException {
        //Reference is Drink
        System.out.println("******************");
        Drink drink = new Drink();
        drink.showDrinkMsg("this drink is healthy");
        drink.consume(3);
        System.out.println(drink.countPrice(4));
        drink.prepare();
        System.out.println(drink.measure());
        //drink.showLiquidQuantity(6); //It's accessible just within the Interface cause is private
        //drink.convert(10);           //Static method may be invoked on containing interface class only
        System.out.println(Consumable.convert(10));

        //Reference is Liquid
        System.out.println("******************");
        Liquid drink2 = new Drink();
        //drink2.showDrinkMsg("this drink is healthy"); //showDrinkMsg is accesseible only from Drink reference
        //drink2.consume(3);
        //System.out.println(drink2.countPrice(4));
        drink2.prepare();
        System.out.println(drink2.measure());
        System.out.println(Consumable.convert(10));


        //Reference is Consumable
        System.out.println("******************");
        Consumable drink3 = new Drink();
        //drink3.showDrinkMsg("this drink is healthy");
        drink3.consume(3);
        System.out.println(drink3.countPrice(4));
        //drink3.prepare();
        System.out.println(drink3.measure());
        //drink3.showLiquidQuantity(6);               //It's private
        //System.out.println(drink3.convert(10)); //Static method may be invoked on containing interface class only

        System.out.println("************ Comparable ****************");
        User[] users = {new User("karim"), new User("youssef"), new User("adam")};
        Arrays.sort(users);
        Arrays.stream(users).forEach(u -> System.out.println(u.getName()));

        System.out.println("************ Compartor ****************");
        Person[] people = {new Person("sami"), new Person("ahmed"), new Person("ghali")};
        Arrays.sort(people, new PersonCompartor());
        Arrays.stream(people).forEach(p -> System.out.println(p.getName()));

        System.out.println("************ Cloneable ****************");
        Person p1 = new Person("Albert");
        Person p2 = (Person) p1.clone();
        System.out.println(p1==p2);
        System.out.println(p2.getName());;





    }
}