package part7;
import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int word = 0;
        char [] text = str.toCharArray();
        for (int i = 0; i< text.length;i++){
            if (text[i] == ' '){
                word = 0;
            }
        }

        for (int j=0; j<text.length;j++){
            if (text[j] != ' '&& word == 0){
                word = 1;
                count++;
            }else if (text[j] == ' '){
                word = 0;
            }
        }
        System.out.println(count);
    }
}
