package practice_7;

import java.math.BigDecimal;
import java.time.LocalTime;

/**
 * @author Wijdane KHATTAT
 */
public class Drink implements Consumable, Liquid {
    @Override
    public int measure() {
        return 2;
    }

    @Override
    public void consume(int quantity) {
        System.out.println("I consume "+quantity+" Liters");
    }

    public void showDrinkMsg(String s){
        System.out.println(s);
    }

    @Override  //Override default method in Liquid
    public void prepare(){
        System.out.println("Preparing from Drink class");
    }

    //@Override   //not compile
    public String convert(int price){
        return "OK";
    }

    @Override
    public void showError() {
        System.out.println("Error in Drink");
    }
}
