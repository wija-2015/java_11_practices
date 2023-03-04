package practice_7;

import java.util.Arrays;

/**
 * @author Wijdane KHATTAT
 */
public class User implements Comparable<User> {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.getName());
    }

    public static void main(String[] args) {
        User[] users = {new User("toto"), new User("tata"), new User("titi")};
        Arrays.sort(users);
        Arrays.asList(users).forEach(user -> System.out.println(user.getName()));
    }
}
