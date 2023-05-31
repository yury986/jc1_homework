package part13.task55;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class ThreadFile implements Runnable {

    @Override
    public void run() {
        int array [] = new int[10];
        Random random = new Random();
        for (int i = 0; i< array.length; i++){
            array [i] = random.nextInt(100);
        }

        String str = Arrays.toString(array);

        File file = new File("array.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists.");
            }

            System.out.println("Thread's name is:" + Thread.currentThread().getName() + "," + " " + "array of numbs" + str + "has written.");

            FileWriter fileWriter = new FileWriter("array.txt",true);
            fileWriter.write(str + "\n");
            fileWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
