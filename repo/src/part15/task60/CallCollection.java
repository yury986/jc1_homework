package part15.task60;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class CallCollection implements Callable {
    @Override
    public Object call() throws Exception {
        String threadName = Thread.currentThread().getName();
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        int numb;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            numb = random.nextInt(10);
            array.add(numb);
            sum += numb;
        }
        String str = Integer.toString(sum);
        Thread.sleep(5000);
        return str + " " + threadName;
    }
}
