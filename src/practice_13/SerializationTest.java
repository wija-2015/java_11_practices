package practice_13;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Wijdane KHATTAT
 */
public class SerializationTest {
    private static final Logger LOGGER = Logger.getLogger(User.class.getName());
    public static void main(String[] args) {
        String path = "D:/Formations/Formations orange/Java_11/OmniAcademy/labs/src/practice_13/";
        User user =  new User("Adam", 12, "Casablanca");
        /*try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path+"user_1.txt"))){
            out.writeObject(user);
            System.out.println("Writing");
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Failed write object into a file", e);
        }*/

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path+"user_1.txt"))) {
            System.out.println("Reading");
            User user2 = (User)in.readObject();
            System.out.println(user2.getName() +" "+user2.getAge()+" "+user2.getAddress() +" "+ user2.getDescription());
        } catch (FileNotFoundException e) {
            LOGGER.log(Level.SEVERE, "File not found", e);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Failed to read object from file", e);
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.SEVERE, "Unknown serialised type", e);
        }
    }
}
