package part9.task37;

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


    public static void next() {
        Scanner sc = new Scanner(System.in);
        String season = sc.next();
        Seasons[] seasons = Seasons.values();
        if (season.equals("SUMMER")) {
            int i = (Seasons.SUMMER.ordinal());
            System.out.println(seasons[i + 1]);
        } else if (season.equals("SPRING")) {
            int i = (Seasons.SPRING.ordinal());
            System.out.println(seasons[i + 1]);
        } else if (season.equals("FALL")) {
            int i = (Seasons.FALL.ordinal());
            System.out.println(seasons[i + 1]);
        } else if (season.equals("WINTER")) {
            int i = (Seasons.WINTER.ordinal());
            System.out.println(seasons[i-3]);
        } else {
            System.out.println("It not season");
        }
    }
}
