package part1;

public class Task13 {
    public static void main(String[] args) {
        int i = 0;
        int result = 1;
        while (i <= 10) {
            result = result * i;
            if (i == 0) {
                result = 1;
            }
            System.out.println (i + "!" + "=" + result);
            i++;
        }

    }
}
