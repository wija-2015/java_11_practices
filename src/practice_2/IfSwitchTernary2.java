package practice_2;

/**
 * @author Wijdane KHATTAT
 */
public class IfSwitchTernary2 {
    public static void main(String[] args) {

        //1. If/else
        char someChar='B';
        if(someChar >= 'a'  && someChar <= 'z'){
            someChar-=32;
        }else {
            someChar+=32;
        }
        System.out.println(someChar);

        //2.Ternary operator
        System.out.println("\n*******************************");
        someChar =(someChar >= 'a' && someChar <= 'z') ? (char)(someChar-32) : (char)(someChar+32);
        System.out.println(someChar);

        //3.Switch
        System.out.println("\n*******************************");
        int per =4;
        float amount = 10;
        float rate = 0.05F;
        switch (per){
            case 3:
                amount+=amount*rate;
            case 2:
                amount+=amount*rate;
            case 1:
                amount+=amount*rate;
        }

        System.out.println(amount);

        //4. SWITCH
        System.out.println("\n*******************************");
        int period = 3;
        String s="";
        switch(period) {
            case 3:
                s = s+"Period of three days ";
            case 2:
                s = s+"Period of two days ";
            case 1:
                s = s+"Period of one day ";
        }
        System.out.println(s);


    }
}
