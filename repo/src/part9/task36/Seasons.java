package part9.task36;

import  java.util.Scanner;
  public enum Seasons {

    SPRING("synny", 92), SUMMER("hoty", 92), FALL("windy", 91),
    WINTER("coldy", 90);


    private String discription;

    private int countOfDays;

    Seasons(String discription, int countOfDays) {
        this.discription = discription;
        this.countOfDays = countOfDays;
    }

    public String getDiscription() {
      return discription;
    }

    public int getCountOfDays() {
      return countOfDays;
    }
}
