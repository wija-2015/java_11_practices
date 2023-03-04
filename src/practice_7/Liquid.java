package practice_7;

/**
 * @author Wijdane KHATTAT
 */
public interface Liquid {

    public int measure();
    public default void prepare(){
        System.out.println("Preparing from Liquid Interface");
    }

    public default void showError () {System.out.println("Error in Liquid") ;}

}
