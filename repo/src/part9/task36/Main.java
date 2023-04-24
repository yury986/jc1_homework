package part9.task36;

public class Main {
    public static void main(String[] args) {

        for (Seasons seasons : Seasons.values()){
            System.out.println(seasons);
        }

        Seasons summer =  Seasons.SUMMER;
        System.out.print(Seasons.SUMMER);
        System.out.print(" " + "is" + " " + summer.getDiscription() + " " + "season");
        System.out.print("." + " " + "It has" + " " + summer.getCountOfDays() + " " + "days" + ".");

        }
    }

