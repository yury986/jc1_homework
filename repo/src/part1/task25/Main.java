package part1.task25;

public class Main {
    public static void main(String[] args) {

        Time obj1 = new Time(23,77,50);
        Time obj2 = new Time(183643);

       System.out.println(obj1.getallSec());
        System.out.println(obj2.getSec());
        obj1.compare(obj2);
    }
}









