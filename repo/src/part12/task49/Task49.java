package part12.task49;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Task49 {
    public static void main(String[] args) {
        int num = 0;
        int sum;
        String digits="";
        try {
            File file = new File("C:/jc1_homework/repo/src/part12/task49/textFile.txt");
            if (file.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already exists");
            }
            FileReader fr = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            fr.read(chars);
            String fileContent = new String(chars);
            System.out.println(fileContent);
            Set <Integer> set = new HashSet<>(chars.length);
            fileContent +=" ";
            for (int i = 0; i < fileContent.length(); i++) {
                char chrs = fileContent.charAt(i);
                if (Character.isDigit(chrs))
                    digits += chrs;
                else {
                    if (!digits.equals("")) {
                        sum = Integer.parseInt(digits);
                        num +=sum;
                        digits = "";
                        set.add(sum);
                        System.out.print(sum + "," + " ");
                    }
                }
            }

            System.out.println("\nSum of numbers"+ " " +num);
            System.out.println(set);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
