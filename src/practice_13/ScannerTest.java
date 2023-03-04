package practice_13;

import java.util.Scanner;

/**
 * @author Wijdane KHATTAT
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  //System.in : InputStream
        System.out.println("To quite type : exit");   //System.out :PrintStream
        System.out.println("Write a value :");
        String txt = null;
        while (!(txt = s.nextLine()).equals("exit")){
            System.out.println("Entered value :"+txt);
        }
        System.err.println("Programm is exited");
    }}

