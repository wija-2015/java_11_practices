package practice_13;

import java.io.*;

/**
 * @author Wijdane KHATTAT
 */
public class ReadWriteCharacterData {
    public static void main(String[] args) {
        String path = "D:/Formations/Formations orange/Java_11/OmniAcademy/labs/src/practice_13/";
        try (Reader in = new FileReader(path+"products.txt");
             Writer out = new FileWriter(path+"result-char.txt")){
            char[] buffer = new char[1024];
            int length = 0;
            while ((length = in.read(buffer)) != -1){
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }}}
