package part1.task11;

public class Houses {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 10;
        int d = 3;
        int e = 6;
        int f = 10;
            // Дома распологаются параллельно        Дома распологаются в длину
            // друг другу и ширины складываются      длины складываются а из ширин
            // а из длин находится максимальная.     находится максимальная.
        if ((f >= b + d && e >= a && e >= c)||(e >= a + c && f >= b && f >= d)||
                (e >= b+d && f >= a && f >=c)||(f >= a+c && e >= b && f >= d)){

            System.out.println("Дома помещаются.");
        }else{
            System.out.println("Дома не помещаются.");
        }
    }
}

