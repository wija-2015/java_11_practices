package practice_12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Wijdane KHATTAT
 */
public class SomeRessource implements AutoCloseable {
    public void doThing(boolean error) throws Exception {
        if (error) {
            System.out.println("doThing with error");
            throw new Exception("doThing failed");
        }
    }
    @Override
    public void close() throws Exception {
        System.out.println("Close method is executed");
        throw new RuntimeException("close failed");
    }
    public static void main(String[] args) {
        try (SomeRessource some= new SomeRessource()){
            some.doThing(true);
        } catch (Exception e) {
            System.out.println("catched exception "+e);
            Throwable[] suppressedExceptions = e.getSuppressed();
            for (final Throwable exception : suppressedExceptions) {
                System.out.println("Suppressed Exception:" +exception);
            }
        }
    }}
