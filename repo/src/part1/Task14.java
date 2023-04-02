package part1;

public class Task14 {
    public static void main(String[] args) {
        long i = 1l;
        long result = 1l;
        do {
            result = result * i;
            i++;

        } while (i <= 25);

        System.out.println(result);

    }
}
