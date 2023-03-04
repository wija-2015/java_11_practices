package practice_12;


/**
 * @author Wijdane KHATTAT
 */
public class CustomException extends Exception {
    public CustomException() {
        super();
    }
    public CustomException(String message) {
        super(message);
    }
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
