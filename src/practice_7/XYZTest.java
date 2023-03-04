package practice_7;

/**
 * @author Wijdane KHATTAT
 */
public class XYZTest {
    public static void main(String[] args) {
        System.out.println("******************");
        Z z = new Z();
        z.count();
        z.showMsg();
        System.out.println(z.x);
        System.out.println();
        if(z instanceof X){
            X x = (X)z;
            x.count();
            //x.showMsg();
            System.out.println(x.x);
        }
        System.out.println();
        if (z instanceof Y){
            Y y = (Y)z;
            y.count();
            y.showMsg();
        }
    }
}
