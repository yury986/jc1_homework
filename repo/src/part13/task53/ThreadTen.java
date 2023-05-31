package part13.task53;

import java.util.Random;

public class ThreadTen extends Thread {

    public ThreadTen(String name) {
        super(name);
    }

    public  void  run (){
        System.out.println("Threadclass run() method" + "Thread name is:" + this.getName());

        int array [] = new int [10];
        Random random = new Random();
        double sum = 0;
        double average;

        for (int i = 0; i< array.length; i++){
            array[i] = random.nextInt(10);
            sum += array[i];
            System.out.print(array[i] + " ");
        }
        average = sum / array.length;
        System.out.println("Average:" + average);

    }

}
