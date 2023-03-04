package practice_12;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

/**
 * @author Wijdane KHATTAT
 */
public class ProductService {
    public void verifyQuantity(int quantity) throws NoSuchFileException, CustomException {
        if (quantity == 0){
            throw new NullPointerException();
        }
        if(quantity == 1){
            throw new NoSuchFileException("No file exist");
        }
        if(quantity == 2){
            throw  new CustomException("Error during quantity of 2");
        }
        if(quantity == 3){
            throw new IndexOutOfBoundsException("Quantity 3 is out of range");
        }
    }
}
