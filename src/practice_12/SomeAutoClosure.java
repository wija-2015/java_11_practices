package practice_12;

import java.io.IOException;

/**
 * @author Wijdane KHATTAT
 */
public class SomeAutoClosure implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Close method of finally bloc is executed");
    }
    public static void main(String[] args) {
        try (SomeAutoClosure some= new SomeAutoClosure()){
            System.out.println("executing my traitments");
        } catch (Exception e) {
            System.out.println("catched exception "+e);
        }
    }}
