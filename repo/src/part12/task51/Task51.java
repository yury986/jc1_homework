package part12.task51;

import java.io.*;
import java.util.Random;

public class Task51 {
    public static void main(String[] args) {

        try{
            boolean dir = new File("packege1/packege2/packege3").mkdirs();
            File numbs = new File ("packege1/packege2/packege3","textoutput.txt");
            File list = new File("packege1/packege2/packege3","list.txt");
            int array[] = new int[10];
            Random random = new Random();
            for (int i = 1; i<6; i++) {
                File file = new File("packege1/packege2/packege3", "text" + i + ".txt");
                file.createNewFile();
                for (int j = 0; j < 10; j++) {
                    array[j] = random.nextInt(100);
                    FileWriter fw = new FileWriter(file, true);
                    fw.write((array[j]) + " ");
                    fw.close();
                }
                InputStream in = new FileInputStream(file);
                OutputStream out = new FileOutputStream(numbs , true);

                byte[] buffer = new byte[1024];
                int lengthRead;
                while ((lengthRead = in.read(buffer)) > 0) {
                    out.write(buffer, 0, lengthRead);
                    out.flush();
                }
                FileWriter fs = new FileWriter(list,true);
                fs.write(file.getName() + "\n");
                fs.close();


            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
