package practice_7;

/**
 * @author Wijdane KHATTAT
 */
public interface Consumable{
    public static final int DEFAULT_PRICE = 10;
    public default int countPrice(int quantity){
        showLiquidQuantity(quantity);
        return quantity*DEFAULT_PRICE;
    }
    public static String convert(int price){
        String result = "No drink exist";
        switch(price){
            case 5:
                result = "Coca";
                break;
            case 10:
                result = "Orange juice";
                break;
            case 15:
                result= "Ananas Juice";
                break;
        }
        return result;
    }
    private void showLiquidQuantity(int quantity){
        System.out.println("Liquid quantity is : "+quantity);
    }
    public abstract int measure();
    void consume(int quantity);

    public default void showError() {
        System.out.println("Error in Consumable") ;}

    public default void showError(String msg) {
        System.out.println(msg) ;}

    private static int To(String s){
        return s.length();
    }


}
