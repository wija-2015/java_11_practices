package practice_13;

import java.io.*;

/**
 * @author Wijdane KHATTAT
 */
public class ReadWriteBinaryData {
    public static void main(String[] args) {
        String path = "D:/Formations/Formations orange/Java_11/OmniAcademy/labs/src/practice_13/";
        try (InputStream in = new FileInputStream(path+"products.txt");
             OutputStream out = new FileOutputStream(path+"result2.txt")){
            byte[] buffer = new byte[40];
            int length = 0;
            while ((length = in.read(buffer)) != -1){
                System.out.println("length is "+length);
                out.write(buffer, 0, length);
            }
            //long amountOfData = in.transferTo(out);
            //System.out.println(amountOfData);
        } catch (IOException e) {
            e.printStackTrace();
        }}}
