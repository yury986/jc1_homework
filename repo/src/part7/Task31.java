package part7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("<p[^<>]+>");
        Matcher m = p.matcher(str);
        while (m.find()) {
            int start=m.start();
            int end=m.end();
            System.out.println("Найдено совпадение " + str.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
        }
        System.out.println(m.replaceAll("<p>"));
    }
}
