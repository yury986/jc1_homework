package part15.task60;


import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        List <Future<String>> futureList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Callable<String> callCollection = new CallCollection();
            Future<String> future = pool.submit(callCollection);
            futureList.add(future);

        }

        for (Future<String> f: futureList) {
            System.out.println(f.get());
        }


        pool.shutdown();
    }
}
