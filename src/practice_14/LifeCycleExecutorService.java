package practice_14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Wijdane KHATTAT
 */
public class LifeCycleExecutorService {
    public static void main(String[] args) {
        /* create pool of 3 threads */
        ExecutorService es = Executors.newFixedThreadPool(3);
        /* launch 10 Runnable tasks with up to 3 running at any time */
        for (int i = 0; i < 10; i++) {
            int x =i;
            es.execute(()->{
                System.out.println("task executing : "+Thread.currentThread().getName());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        try {
            if (!es.awaitTermination(20, TimeUnit.SECONDS)){
                System.out.println("***** Shutdown *****");
                es.shutdownNow();
            }
        }catch(InterruptedException e){
            es.shutdownNow();
        }}}
