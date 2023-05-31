package part15.task59;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService pool = Executors.newFixedThreadPool(3);
    Set<Future<List<String>>> futureSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Callable<List<String>> callfile = new CallFile();
            Future <List<String>> future = pool.submit(callfile);
            futureSet.add(future);

        }


        for (Future <List<String>> f: futureSet) {
            System.out.println(f.get());
        }


        pool.shutdown();

    }
}
