package practice_12;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.logging.Logger;

/**
 * @author Wijdane KHATTAT
 */
public class ProductServiceTest {
    private static final Logger LOGGER = Logger.getLogger(ProductServiceTest.class.getName());
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        try {
            productService.verifyQuantity(2);
            return;
        } catch (NoSuchFileException e) {
            LOGGER.severe("NoSuchFileException is catched");
        } catch (CustomException e) {
            LOGGER.severe("CustomException is catched");
        }catch (NullPointerException | ArithmeticException e){
            LOGGER.severe("NullPointerException is catched");
        }catch (IndexOutOfBoundsException e) {
            LOGGER.severe("IndexOutOfBoundsException is catched");
        }catch (RuntimeException e) {
            LOGGER.severe("RuntimeException is catched");
        }finally {
            LOGGER.info("The finally bloc will be always executed");
        }
        int x = 10;
        System.out.println("x value is "+x);
    }

    /*try {
           methodA(); // Line 5
       } catch (RuntimeException e) {
           e.printStackTrace();
       }
    static void methodA() throws ArithmeticException { // Line 1
        throw new RuntimeException(); // Line 2
    }
    void methodB() throws IOException{ // Line 3
        methodA(); // Line 4
    }
     */


}
