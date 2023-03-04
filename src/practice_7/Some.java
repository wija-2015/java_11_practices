package practice_7;

/**
 * @author Wijdane KHATTAT
 */
public class Some {
    private Object value;

    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Some some = new Some();
        some.setValue("Hello java");
        System.out.println(some.getValue());
        Integer number =(Integer) some.getValue();
        System.out.println(number);
    }
}

