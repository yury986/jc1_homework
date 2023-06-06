package part16;

import java.util.ArrayList;
import java.util.List;


public class task62 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        for (double i = 1; i <= 20; i++) {
            list.add(i);
        }

        list.stream()
                .forEach(System.out::println);
        double sum = list.stream()
                .map((x) -> x * 2.54).mapToInt(Double::intValue).sum();
        System.out.println(sum);

    }
}
