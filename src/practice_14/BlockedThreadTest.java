package practice_14;

/**
 * @author Wijdane KHATTAT
 */
public class BlockedThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Some s = new Some();
        Runnable r = () -> {
            synchronized (s) { //Blocked state
                try {
                    s.showMsg();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }};
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        Thread.sleep(2000);
        System.out.println(t1.getState());
        System.out.println(t2.getState());


    }
}
