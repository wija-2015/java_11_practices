package practice_13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

/**
 * @author Wijdane KHATTAT
 */
public class FileSystemTest {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        fs.getFileStores().forEach(s -> {
            try {
                System.out.println(s+" "+s.getTotalSpace());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println("\n******");
        fs.getRootDirectories().forEach(p -> System.out.println(p));
        System.out.println("\n******");
        String seperator = fs.getSeparator();
        System.out.println(seperator);
    }
}
