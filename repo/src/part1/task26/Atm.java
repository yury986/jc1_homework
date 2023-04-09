package part1.task26;

import java.util.Scanner;

public class Atm {
    static int x100 = 100;
    static int x50 = 50;
    static int x20 = 20;

    public static int max100;
    public static int max50;
    public static int max20;
    static int maxSum;

    public Atm(int max100, int max50, int max20) {
        this.max100 = max100; // кол-во купюр

        this.max50 = max50;

        this.max20 = max20;
    }

    public static int addMoney() {

        for (int i = 0; i < max100; i++) {
            maxSum += x100;
        }
        for (int i = 0; i < max50; i++) {
            maxSum += x50;
        }
        for (int i = 0; i < max20; i++) {
            maxSum += x20;
        }
        return maxSum;
    }

    public static void takeMoney() {
        Scanner sc = new Scanner(System.in);
        int enterSum;
        do {
            enterSum = sc.nextInt();
            if (enterSum > maxSum){
                System.out.println("Wrong sum, pleas enter correct sum");
            }
            else if (enterSum <= maxSum) {
                maxSum = maxSum - enterSum;
                int hundred = enterSum/ 100;
                int fifty = (enterSum - hundred * 100) / 50;
                int twenty =  ((enterSum - hundred * 100) - fifty * 50)/20;
                System.out.println("Take cash:" + " " + "hundred:" + hundred + " " + "fifty:" + fifty + " " + "twenty" + twenty);
                System.out.println("The rest of money:" + " " + maxSum);
            }

        }while (maxSum != 0) ;
        System.out.println("Add Money");
    }
}





