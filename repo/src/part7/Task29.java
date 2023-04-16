package part7;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] words = str.split(" ");
        StringBuilder newSentence = new StringBuilder();

        for(String word : words) {
            newSentence.append(word.charAt(word.length()-1));
        }

        System.out.println(newSentence);
        }
    }

