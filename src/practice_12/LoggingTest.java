package practice_12;

import java.io.IOException;
import java.util.logging.*;

/**
 * @author Wijdane KHATTAT
 */
public class LoggingTest {
    private static final Logger LOGGER = Logger.getLogger(LoggingTest.class.getName());
    public static void main(String[] args) throws IOException {
        System.out.println("********** SEVERE/Warning/Info************");
        LOGGER.log(Level.INFO, "Thats INFO Level Log");
        LOGGER.warning("Thats WARNING Level Log");

        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINEST);
        LOGGER.addHandler(consoleHandler);
        System.out.println(consoleHandler.getLevel());

        LOGGER.setLevel(Level.FINEST);
        LOGGER.config("Thats CONFIG Level Log");
        LOGGER.fine("Thats FINE Level Log");
        LOGGER.finer("Thats FINER Level Log");
        LOGGER.finest("Thats FINEST Level Log");


        /*System.out.println("\n********** CONFIG/FINE/FINER/FINEST ************");
        consoleHandler.setLevel(Level.FINEST);
        LOGGER.addHandler(consoleHandler);
        System.out.println(consoleHandler.getLevel());


        System.out.println("\n********** logp ************");
        LOGGER.logp(Level.INFO, LoggingTest.class.getName(), "main()", "This log for logp method");
        //LOGGER.logrb(); //like logp + Resource Bundle
        System.out.println("\n********** Guarded Logging ************");
        int id = 99;
        LOGGER.log(Level.INFO, "Product "+id+" has been selected");
        if(LOGGER.isLoggable(Level.FINER)) {
            LOGGER.log(Level.FINE, "Product "+id+" has been selected");
        }
        LOGGER.log(Level.WARNING, "Product {0} has not been selected", id);*/

    }
}


