package part16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task64 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxValue = sc.nextInt();
        int minValue = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n ; i++) {
            int num = (int)(Math.random()* (maxValue-minValue)) + minValue;
            list.add(num);
        }

        System.out.println(list);

        list.stream()
                .filter(x -> (x%3==0 && x%5==0))
                .forEach(System.out::println);

    }
}
