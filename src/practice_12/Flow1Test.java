package practice_12;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

/**
 * @author Wijdane KHATTAT
 */
public class Flow1Test {
    public static void main(String[] args) {
              /*int x = 5;
              int y = 0;
              int z = divide(x,y);
              System.out.println(z);*/
            try {
                openFile(null);
            }catch(IOException e) {
                e.printStackTrace();
            }//IOException is catched and not NoSuchFileException
             // but the stack Trace in the console is of NoSuchFileException
    }
    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Error: "+x+"/"+y);
        }
        int z = x/y;
        return z;
    }

    public static void openFile(String fileName) throws IOException {
        if (fileName == null) {
            throw new NoSuchFileException("Filename must be set");
        }
    }

}
