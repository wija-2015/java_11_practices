package practice_7;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Wijdane KHATTAT
 */
public class Person implements Cloneable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Person[] people = {new Person("sami"), new Person("ghali"), new Person("ali")};
        Arrays.sort(people, new PersonCompartor());
        Arrays.stream(people).forEach(e -> System.out.println(e.getName()));

        System.out.println("\n*****************************");
        Person person = new Person("Me");
        try {
            Person newPerson = (Person) person.clone();
            System.out.println(newPerson.getName());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

class PersonCompartor implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
