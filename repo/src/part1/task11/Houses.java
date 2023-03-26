package part1.task11;

public class Houses {
    public static void main(String[] args) {
        int a = 6;   // Длина
        int b = 4;   // Ширина
        int c = 7;   // Длина
        int d = 5;   // Ширина
        int e = 7;   // Длина
        int f = 9;   // Ширина
            // Дома распологаются параллельно        Дома распологаются в длину
            // друг другу и ширины складываются      длины складываются а из ширин
            // а из длин находится максимальная.     находится максимальная.
        if ((f >= b + d && e >= a && e >= c)||(e >= a + c && f >= b && f >= d)) {

            System.out.println("Дома помещаются.");
        }else{
            System.out.println("Дома не помещаются.");
        }
    }
}

