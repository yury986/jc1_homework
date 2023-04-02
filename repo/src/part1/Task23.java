package part1;

public class Task23 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
        for (int j = 0; j< array.length/2; j++){ // Делим массив пополам. И проходим циклом по левой части.
            int stor = array[j];  // Помещаем значение из левой части массива в переменную.
            array[j] = array[array.length -j-1]; // Присваеваем значение из правой части индексу из левой.
            array[array.length-j-1] = stor; // Индексу из правой части присваеваем значение из переменной.
        }
        for (int e = 0; e < array.length; e++){
            System.out.println(array[e]);
        }

    }
}
