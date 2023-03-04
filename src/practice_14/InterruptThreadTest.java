package practice_14;

/**
 * @author Wijdane KHATTAT
 */
public class InterruptThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = () -> {
            Thread ct = Thread.currentThread();
            System.out.println(ct.getState());
            while(!ct.isInterrupted()){
                System.out.println("Thread is running");
                try {
                    ct.sleep(1000); // Time-Waiting state
                } catch (InterruptedException e) {
                    System.out.println("Interrupted Signal is catched");
                    e.printStackTrace();
                    return;
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Thread.sleep(10000);
        t1.interrupt();
    }
}
