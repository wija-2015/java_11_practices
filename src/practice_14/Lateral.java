package practice_14;

/**
 * @author Wijdane KHATTAT
 */
public class Lateral extends Thread {
    private int i= 3;
    @Override
    public void run() {
        Thread th = Thread.currentThread();
        System.out.println("Thread running : "+th.getName()+" and i :"+(++i));
        System.out.println("I'm doing my work");
    }
}
class Lateral2 implements Runnable {
    private int j= 8;
    @Override
    public void run() {
        Thread th = Thread.currentThread();
        System.out.println("Thread running : "+th.getName()+ " and j : " +(++j));
    }
}
class ThreadTest{
    public static void main(String[] args) {
        Lateral lateral1 = new Lateral();
        Thread t1 = new Thread(lateral1);
        Thread t2 = new Thread(lateral1);
        t1.start();
        t2.start();

        Lateral2 lateral2 = new Lateral2();
        Thread t3 = new Thread(lateral2);
        Thread t4 = new Thread(lateral2);
        t3.start();
        t4.start();

        Runnable r = () -> {
            int k=20; // not incremented cause is not an instance variable
            Thread th = Thread.currentThread();
            System.out.println("Thread running : "+th.getName()+ " and k : " +(++k));
        };
        Thread t5 = new Thread(r);
        Thread t6 = new Thread(r);
        t5.start();
        t6.start();
    }
}
