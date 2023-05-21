package part12.task51;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Task51 {
    public static void main(String[] args) {
        String str = "";
        try{
            boolean dir = new File("packege1/packege2/packege3").mkdirs();
            File numbs = new File ("packege1/packege2/packege3","textoutput.txt");
            if (numbs.createNewFile()){
                System.out.println("File:" + numbs.getName() + " " + " is created!");
            }else{
                System.out.println("File:" + numbs.getName() + " " + "already exists.");
            }
            File list = new File("packege1/packege2/packege3","list.txt");
            if (list.createNewFile()){
                System.out.println("File:" + list.getName() + " " + " is created!");
            }else{
                System.out.println("File:" + list.getName() + " " + "already exists.");
            }
            int array[] = new int[10];
            Random random = new Random();
            for (int i = 1; i<6; i++) {
                File file = new File("packege1/packege2/packege3", "text" + i + ".txt");
                if (file.createNewFile()){
                        System.out.println("File:" + file.getName() + " " + " is created!");
                    }else{
                        System.out.println("File:" + file.getName() + " " + "already exists.");
                    }
                for (int j = 0; j < array.length; j++) {
                    array[j] = random.nextInt(100);
                    str = Arrays.toString(array);
                }
                    FileWriter fw = new FileWriter(file, true);
                    fw.write(str + "\n");
                    fw.close();


                    System.out.println("Array of numbs:" + str + " " + "has written to file:" +file.getName());

                InputStream in = new FileInputStream(file);
                OutputStream out = new FileOutputStream(numbs , true);

                byte[] buffer = new byte[1024];
                int lengthRead;
                while ((lengthRead = in.read(buffer)) > 0) {
                    out.write(buffer, 0, lengthRead);
                    out.flush();
                }
                System.out.println("Array of numbs:" + str + " " + "has written to file:" + numbs.getName());

                FileWriter fs = new FileWriter(list,true);
                fs.write(file.getName() + "\n");
                fs.close();


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
