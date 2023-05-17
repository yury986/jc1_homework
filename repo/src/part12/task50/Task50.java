package part12.task50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Task50 {
    public static void main(String[] args) {

        int[] array;
        array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));

        }
            String str = Arrays.toString(array);

        try {

         File file = new File("C:/jc1_homework/repo/src/part12/task50/javainput.dat");
         FileOutputStream fos = new FileOutputStream(file);
            byte[] output = str.getBytes();
            fos.write(output, 0, output.length);
            System.out.println("Successfully written data to the file");

            FileInputStream fis=new FileInputStream("C:/jc1_homework/repo/src/part12/task50/javainput.dat");
            byte[] input = new byte[256];
            int count;
            double middle = 0;
            double sum = 0;
            while((count=fis.read(input))!=-1) {

                for (int i = 0; i < count; i++) {

                    System.out.print((char) input[i]);
                    sum += input[i];
                    middle =  sum / 20;

                }
            }
            System.out.println("\n" + middle);
            fos.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
