package part1;

public class Task20 {
    public static void main(String[] args) {
        int  array []= new int [10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < array.length; i++){
            if (i%2==0){
                System.out.println(array[i]);
            }
        }
    }
}
