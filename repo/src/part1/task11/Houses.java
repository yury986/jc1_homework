package part1.task11;

public class Houses {
    public static void main(String[] args) {
        int a = -1;
        int b = 1;
        int c = 2;
        int d = 1;
        int e = 6;
        int f = 10;
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0 || e <= 0 || f <= 0) {
            System.out.println("Ошибка.");

        }else if ((f >= b + d && e >= a && e >= c)||(e >= a + c && f >= b && f >= d)||
                (e >= b+d && f >= a && f >=c)||(f >= a+c && e >= b && f >= d)){

            System.out.println("Дома помещаются.");
        }else{
            System.out.println("Дома не помещаются.");
        }
    }
}

