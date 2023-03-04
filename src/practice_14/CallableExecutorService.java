package practice_14;

import java.util.concurrent.*;

/**
 * @author Wijdane KHATTAT
 */
public class CallableExecutorService {
    public static void main(String[] args) {
        Callable<String> t = new Callable<>() {
            public String call() throws Exception {
                Thread.sleep(8000);
                return "Formation Java";
            }};
        ExecutorService es = Executors.newFixedThreadPool(10);
        Future<String> result = es.submit(t);
        try {
            String value = result.get(10, TimeUnit.SECONDS);
            System.out.println("value is getted :"+value);
            es.shutdown();
        } catch(Exception e) {
            System.out.println("value not getted");
            es.shutdown();
        }}}
