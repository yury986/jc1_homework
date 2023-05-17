package part12.task51;

import java.io.*;

public class Task51 {
    public static void main(String[] args) {

        try {

            boolean dir = new File("packege1/packege2/packege3").mkdirs();

            String str1 = "4,2,3,4,5,6,7,8,9,7 \n";

            File file1 = new File("packege1/packege2/packege3", "text1.txt");
            FileOutputStream fos = new FileOutputStream(file1);
            byte[] output = str1.getBytes();
            fos.write(output, 0, output.length);

            File file = new File("packege1/packege2/packege3","text.txt");

            InputStream in = new FileInputStream(file1);
            OutputStream out = new FileOutputStream(file,true);

            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }

            String str2 = "6,2,4,3,5,6,7,5,9,8 \n";

            File file2 = new File("packege1/packege2/packege3", "text2.txt");
            FileOutputStream fos2 = new FileOutputStream(file2);
            byte[] output2 = str2.getBytes();
            fos2.write(output2, 0, output2.length);

            InputStream in2 = new FileInputStream(file2);
            OutputStream out2 = new FileOutputStream(file,true);

            byte[] buffer2 = new byte[1024];
            int lengthRead2;
            while ((lengthRead2 = in2.read(buffer2)) > 0) {
                out2.write(buffer2, 0, lengthRead2);
                out2.flush();
            }

            String str3 = "6,5,8,4,5,1,8,5,3,2 \n";

            File file3 = new File("packege1/packege2/packege3", "text3.txt");
            FileOutputStream fos3 = new FileOutputStream(file3);
            byte[] output3 = str3.getBytes();
            fos3.write(output3, 0, output3.length);

            InputStream in3 = new FileInputStream(file3);
            OutputStream out3 = new FileOutputStream(file,true);

            byte[] buffer3 = new byte[1024];
            int lengthRead3;
            while ((lengthRead3 = in3.read(buffer3)) > 0) {
                out3.write(buffer3, 0, lengthRead3);
                out3.flush();
            }

            String str4 = "1,2,4,4,5,1,7,5,9,7 \n";

            File file4 = new File("packege1/packege2/packege3", "text4.txt");
            FileOutputStream fos4 = new FileOutputStream(file4);
            byte[] output4 = str4.getBytes();
            fos4.write(output4, 0, output4.length);

            InputStream in4 = new FileInputStream(file4);
            OutputStream out4 = new FileOutputStream(file,true);

            byte[] buffer4 = new byte[1024];
            int lengthRead4;
            while ((lengthRead4 = in4.read(buffer4)) > 0) {
                out4.write(buffer4, 0, lengthRead4);
                out4.flush();
            }

            String str5 = "8,6,3,7,1,9,2,4,7,6 \n";

            File file5 = new File("packege1/packege2/packege3", "text5.txt");
            FileOutputStream fos5 = new FileOutputStream(file5);
            byte[] output5 = str5.getBytes();
            fos5.write(output5, 0, output5.length);

            InputStream in5 = new FileInputStream(file5);
            OutputStream out5 = new FileOutputStream(file,true);

            byte[] buffer5 = new byte[1024];
            int lengthRead5;
            while ((lengthRead5 = in5.read(buffer5)) > 0) {
                out5.write(buffer5, 0, lengthRead5);
                out5.flush();
            }

            File file6 = new File("packege1/packege2/packege3", "list.txt");
            FileWriter fr = new FileWriter(file6);
            fr.write(file1.getName() + "\n");
            fr.write(file2.getName() + "\n");
            fr.write(file3.getName() + "\n");
            fr.write(file4.getName() + "\n");
            fr.write(file5.getName() + "\n");
            fr.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
