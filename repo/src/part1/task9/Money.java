package part1.task9;

public class Money {
    public static void main(String[] args) {
        int cash = 120;
        if (cash % 100 >= 11 && cash % 100 <= 14) {
            System.out.println(cash + " " + "рублей.");
        }else if (cash % 10 == 1) {
            System.out.println(cash + " " + "рубль.");
        }else if (cash % 10 >= 2 && cash % 10 <= 4){
            System.out.println(cash + " " + "рубля.");
        }else if (cash % 10 >= 5 || cash % 10 == 0) {
            System.out.println(cash + " " + "рублей.");
        }else if (cash<0){
            System.out.println("Ошибка");
        }
    }
}
