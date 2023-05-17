package part12.task48;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task48 {
    public static void main(String[] args) {
        int symbol = 0;
        int word = 1;
        try{
        File file = new File("C:/jc1_homework/repo/src/part12/task48/textFile.txt");
        if (file.createNewFile()){
            System.out.println("File is created");
        }else{
            System.out.println("File already exists");
        }
        FileReader fr = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            fr.read(chars);


            String fileContent = new String(chars);
            System.out.println(fileContent);

            for (int i = 0; i < chars.length; i++) {
                if ((chars[i] == '.') || (chars[i] == ',') || (chars[i] == ';') || (chars[i] == ':') || (chars[i] == '!')
                        ||(chars[i] == '?') || (chars[i] == '-')||(chars[i]== '(') || (chars[i] == ')')||(chars[i]== '"')) {
                    symbol++;
                } else if ((chars[i] == ' ')||(chars[i] == '\n' )) {
                    word++;
                }
            }
            System.out.println("Number of punctuation marks:" + " " + symbol );
            System.out.println("Number of words:" + " " + word);

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
