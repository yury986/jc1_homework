package part1;

public class Task19 {
    public static void main(String[] args) {
        int [] array = new int [10];
        for (int i = 0; i < 10; i++){
            array [i] = (int) (Math.random()*10+1);
            System.out.println(array[i]);
        }
        System.out.println(array[array.length-1]);
    }

}
