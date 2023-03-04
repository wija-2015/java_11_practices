package practice_2;

/**
 * @author Wijdane KHATTAT
 */
public class PrimitiveTypes1 {
    public static void main(String[] args) {
        //2.Declare numeric primitives + typecasting + arithmetic
        byte x =2, y=3, z=5;
        z= (byte) (x+y);

        float a =(float)x/y;

        double b =(double)x/y;
        b=a;
        System.out.println(b);
        float c = Math.round(b*1000)/1000F;
        System.out.println(c);

        //3.Declare char primitives + typecasting + arithmetic
        System.out.println("\n*******************************");
        char a1 = 'a', a2='\141', a3='\u0061';
        int i=a1;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(i);
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));

        System.out.println("\n*******************************");
        int i1 =0141, i2=0x61;
        System.out.println(i1);
        System.out.println(i2);
        char a4= (char) i1;
        System.out.println(a4);

        System.out.println("\n*******************************");
        char someChar='k';
        boolean isEven= (someChar%2 == 0);
        System.out.println(isEven);

        System.out.println("\n*******************************");
        char nextChar = (char) (someChar+1);
        System.out.println(nextChar);
        nextChar= ++someChar;
        System.out.println(nextChar);
        System.out.println(someChar);

        System.out.println("\n*******************************");
        someChar ='b';
        --someChar;
        System.out.println(someChar);

        //6.Calculate the number of symbols betweeen a pair of caracters
        System.out.println("\n*******************************");
        char upperA='A', lowerA='a';
        int distance = lowerA-upperA;
        System.out.println(distance);
        someChar='h';
        char upperSomeChar= (char) (someChar-32);
        System.out.println(upperSomeChar);


    }
}
