package practice_3;

/**
 * @author Wijdane KHATTAT
 */
public class StringStringBuilder1 {

    public static void main(String[] args) {
        //3.1
        //1.Explore String internment
        String teaTxt ="Tea";
        String b = "Tea";
        System.out.println(teaTxt==b);
        String c = new String("Tea");
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(teaTxt));
        System.out.println(System.identityHashCode(c));
        System.out.println(teaTxt == c);
        System.out.println(b);
        System.out.println(teaTxt);
        System.out.println(c);
        c.intern();
        System.out.println(teaTxt == c);
        String d = c.intern();
        System.out.println(teaTxt == d);

        //2.String operations
        System.out.println("\n*****************************");
        c = teaTxt+' '+b;
        System.out.println(c);
        System.out.println(c.indexOf('T', 1));
        System.out.println(c.lastIndexOf('T'));
        System.out.println(c.charAt(c.length()-1));
        c = c.toUpperCase();
        System.out.println(c);
        System.out.println(c.substring(c.lastIndexOf('T'), c.lastIndexOf('T')+2));

        //3.StringBuilder
        System.out.println("\n*****************************");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());

        StringBuilder txt = new StringBuilder(c);
        System.out.println(txt.length());
        System.out.println(txt.capacity());
        txt.replace(0, 3, "What is the price of");
        System.out.println(txt);
        System.out.println(txt.length());
        System.out.println(txt.capacity());


    }
}
