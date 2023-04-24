package part9.task38;

import java.util.Scanner;

public enum Seasons {
    SPRING("synny", 92), SUMMER("hoty", 92), FALL("windy", 91),
    WINTER("coldy", 90);


    private String discription;

    private int countOfDays;

    Seasons(String discription, int countOfDays) {
        this.discription = discription;
        this.countOfDays = countOfDays;
    }
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        String season = sc.next();
        if (season.equals("SUMMER")) {
            System.out.println(SUMMER.countOfDays);
        } else if (season.equals("SPRING")) {
            System.out.println(SPRING.countOfDays);
        } else if (season.equals("FALL")) {
            System.out.println(FALL.countOfDays);
        } else if (season.equals("WINTER")) {
            System.out.println(WINTER.countOfDays);
        } else {
            System.out.println("It not season");
        }
    }
}
