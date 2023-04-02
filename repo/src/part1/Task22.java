package part1;

public class Task22 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        int min = array [0];
        int mini = 0;
        int max = array[0];
        int maxi = 0;
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxi = i;
            }else if (array[i] == max){
                maxi = i;
            }
            if (array[i] < min) {
                min = array[i];
                mini = i;
            }else if (array[i] == min){
                mini = i;
            }
        }
        if (mini<maxi){
            for (int i = mini+1; i<maxi; i++){
                sum += array[i];
            }
        }else{
            for (int i = maxi+1; i<mini; i++){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
