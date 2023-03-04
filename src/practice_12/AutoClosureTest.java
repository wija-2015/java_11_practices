package practice_12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * @author Wijdane KHATTAT
 */
public class AutoClosureTest {
    private static final Logger LOGGER = Logger.getLogger(AutoClosureTest.class.getName());
    public static void main(String[] args) throws IOException {
        String path = "D:/Formations/Formations orange/Java_11/OmniAcademy/labs/src/practice_12";
        BufferedReader in = null;
        try{
             in = new BufferedReader(new FileReader(path+"/test.txt"));
             System.out.println(in.readLine());
             //some instructions
        } catch (FileNotFoundException e) {
            LOGGER.severe("FileNotFoundException is catched");
        } finally {
            in.close();
        }
        //System.out.println(in.readLine());

        try(BufferedReader in2 = new BufferedReader(new FileReader(path+"/test.txt"))){
            System.out.println(in2.readLine());
        } catch (FileNotFoundException e) {
            LOGGER.severe("FileNotFoundException is catched");
        } catch (IOException e) {
            LOGGER.severe("IOException is catched");
        }
    }
}