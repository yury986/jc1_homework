package part1;

public class Task24 {
    public static void main(String[] args) {
        int n = 5;
        int a = n / 2 + 1;
        int mas[][] = new int[n][n];
        for (int i = 0; i < mas.length / 2 + 1; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if ((j < i) || (j >= (mas[i].length - i)))
                    mas[i][j] = 0;
                else
                    mas[i][j] = 1;
            }

        }


        for (int i = mas.length - 1; i >= mas.length / 2 + 1; i--) {
            for (int j = 0; j < mas[i].length; j++) {
                if ((j < (mas[i].length - 1 - i)) || (j > i))
                    mas[i][j] = 0;
                else
                    mas[i][j] = 1;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
           System.out.println(" ");
        }
    }
}
