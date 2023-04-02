package part1;

public class Task21 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        int maxi = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxi = i;
            }
        }
        System.out.println(maxi);
    }
}
