package part15.task61;


import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<File>> futureSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Callable<File> calldate = new CallDate();
            Future <File> future = pool.submit(calldate);
            futureSet.add(future);
        }

        for (Future <File> f: futureSet) {
            System.out.println(f.get());
        }


        pool.shutdown();

    }
}

