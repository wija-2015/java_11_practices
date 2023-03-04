package practice_14;

/**
 * @author Wijdane KHATTAT
 */
public class WaitingThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        Runnable r = () -> {
            try {
                synchronized (obj) {
                    System.out.println("I'm waiting");
                    obj.wait();
                }
            } catch (InterruptedException ex) {
                System.out.println("InterruptedException catched");
            }
            System.out.println("Im back to Runnable state :"+Thread.currentThread().getState());
        };

        Thread t = new Thread(r);
        t.start();

        Thread.sleep(10000);
        synchronized (obj) {
            obj.notify();
        }
    }}
