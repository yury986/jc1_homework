package part13.task54;

import java.util.Arrays;
import java.util.Random;

public class ThreadMax implements Runnable {

    @Override
    public void run() {
        int array [] = new int [10];
        Random random = new Random();
        int max = 0;
        for (int i = 0; i<array.length; i++){
            array[i] = random.nextInt(10);
        }
        String str = Arrays.toString(array);

        for (int j = 0; j<array.length; j++){
            if (array[j]>max){
                max = array[j];
            }
        }
        System.out.println("Thread name is:" + Thread.currentThread().getName() + " " + "Array:" + str + " " + "max element:" + max);
    }
}
