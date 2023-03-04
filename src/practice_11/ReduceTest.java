package practice_11;

import java.util.List;
import java.util.Optional;

/**
 * @author Wijdane KHATTAT
 */
public class ReduceTest {

    public static void main(String[] args) {
        System.out.println("\n************ reduce Operation ************");
        List<String> colors2 = List.of("RED","GREEN","BLUE");
        Optional<String> x1 = colors2.stream()
                .reduce((s1,s2)->s1+" ** "+s2);
        if(x1.isPresent()){
            System.out.println(x1);
            System.out.println(x1.get());
        }


        System.out.println();
        String x2 = colors2.stream()
                .reduce("White", (s1,s2)->s1+" ** "+s2);
        System.out.println(x2);


        System.out.println();
        String x3 = colors2.stream()
                .parallel()
                .reduce("White",(s,p)->p+" ** "+s, (s1,s2)->s1+s2);
        System.out.println(x3);
    }
}
