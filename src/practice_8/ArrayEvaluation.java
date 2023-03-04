package practice_8;

import practice_7.User;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Wijdane KHATTAT
 */
public class ArrayEvaluation {

    public static void main(String[] args) {
        System.out.println("***************************");
        int[] prices = {10, 20, 30};
        System.out.println(prices.length);
        //System.out.println(prices[3]);  //ArrayIndexOutOfBoundsException

        System.out.println("\n***************************");
        User[][]  users= new User[2][3];
        System.out.println(users[1][2]);
        //System.out.println(users[][]);
        //System.out.println(users[1][3]); //ArrayIndexOutOfBoundsException

        System.out.println("\n***************************");
        User[][] allUsers= {{new User("aa"), new User("bb"), new User("cc")},
                            {new User("dd"), new User("ee")}};
        System.out.println(allUsers[0][0].getName());
        System.out.println(allUsers[0][1].getName());
        System.out.println(allUsers[1][2].getName());  //ArrayIndexOutOfBoundsException

        System.out.println("\n************ copy Array ***************");
        int[] prices2 = Arrays.copyOf(prices, 5);
        System.out.println(prices2[2]);
        System.out.println(prices2[4]);
        //System.out.println(prices2[6]);
        System.out.println();
        int[] prices3 = Arrays.copyOfRange(prices, 0, 5);
        Arrays.stream(prices3).forEach(e -> System.out.println(e));

        System.out.println();
        String[] tab1 = {"A", "B", "C", "D"};
        String[] tab2 = {"E","F","","","Z"};
        System.arraycopy(tab1, 1, tab2, 2, 2);
        Arrays.stream(tab2).forEach(e -> System.out.println(e));

        System.out.println("\n************ fill/search ***************");
        String[] values = new String[5];
        Arrays.fill(values, 2, 4, "Hi");
        Arrays.stream(values).forEach(e -> System.out.println(e));

        System.out.println("\n************ equals/sort ***************");
        String[] names1 = {"Mary","Ann","Jane","Tom"};
        String[] names2 = {"Mary","Ann","John","Tom"};
        boolean isTheSame = Arrays.equals(names1, names2);
        System.out.println(isTheSame);
        Arrays.sort(names2);
        Arrays.stream(names2).forEach(e -> System.out.println(e));
    }
}

