package practice_2;

/**
 * @author Wijdane KHATTAT
 */
public class PrimitiveTest {
    public static void main(String[] args) {

        System.out.println("*********JShell*************");
        char x='a', y='b';
        System.out.println(x);
        System.out.println(y);
        if(x<y){
            System.out.println("a est inf à b");
        }

        char z=97, w=80;
        System.out.println(z);
        System.out.println(w);

        byte xx=6, yy =  8, zz=5, ww=127;
        zz=(byte) (xx+yy);
        ww= (byte) (ww+xx);
        System.out.println(zz);
        System.out.println(ww);
        byte myVar= 127;
        System.out.println(myVar);

        System.out.println("\n*********Initialize Primitive Variables*************");
        int a = 0b101010; // binary
        short b = 052;    // octal
        byte c = 42;      // decimal
        long d = 0x2A;    // hex

        float e = 1.99E2F;
        double f = 1.99;
        long g = 5, h = c;
        float i = g;

        char j = 'A';
        char k = '\u0041', l = '\101';
        int s;
        s = 77;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(k);
        System.out.println(s);

        System.out.println("\n********* Restrictions of Primitives *************");
        /*
        byte a;
        byte b = a;
        byte c = 128;
        int d = 42L;
        float e = 1.2;
        char f = "a";
        char g = 'AB';
        boolean h = "true";
        boolean i = 'false';
        boolean j = 0;
        boolean k = False;  */





    }
}
