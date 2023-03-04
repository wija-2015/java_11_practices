package practice_12;

/**
 * @author Wijdane KHATTAT
 */
public class CheckedUncheckedTest {
    public static void main(String[] args) throws Exception {
        int x = -10;
        if(x<0){
            throw new ArithmeticException("this value is lower than 0");
        }
        if(x<0){
            //throw new Exception("this value is lower than 0");
        }
    }
}
