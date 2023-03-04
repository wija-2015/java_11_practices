package practice_4;

import java.util.Arrays;

/**
 * @author Wijdane KHATTAT
 */
class Initializer{
    private int x = 10;
    public static int y = 20;

    {
        System.out.println("instance initializer called");
        System.out.println(x);
    }
    static{
        System.out.println("static initializer called");
        System.out.println(y);
    }
    public void setValue(int... values){
        Arrays.stream(values).forEach(System.out::print);
    }
    public void setValue(int value){
        value= 10;
        System.out.println("value1 is : "+value);
    }
    public void setValue(int value1, int value2){
        System.out.println("value1 is : "+value1+" and value2 is : "+value2);
    }


    public void setValue(long value1, long value2){
        System.out.println("long1 is : "+value1+" and long2 is : "+value2);
    }
}
