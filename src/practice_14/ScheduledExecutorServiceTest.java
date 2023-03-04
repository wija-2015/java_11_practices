package practice_14;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Wijdane KHATTAT
 */
public class ScheduledExecutorServiceTest {
    public static void main(String[] args) throws InterruptedException {
        Lateral task = new Lateral();
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);
        //les 3 threads vont être démarrée après 10 s, et une durée de 2 seconds entre chaque deux thread
        ses.scheduleAtFixedRate(task, 6, 4, TimeUnit.SECONDS);


    }
}
