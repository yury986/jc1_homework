package part1.task10;

public class Date {
    public static void main(String[] args) {
        int a = 28; // День
        int b = 02; // Месяц
        int c = 2020; // Год
        if (a == 28 && b == 02 && c % 4 == 0) {
            System.out.println("29.02." + c);
        }else if (a == 29 && b == 02 && c % 4 == 0){
            System.out.println("1.03." + c);
        }else if (a == 29 || a==30 && b == 02 && c % 4 != 0){
            System.out.println("Такой даты не существует.");
        }else if (a == 31 && b == 1) {
            System.out.println("1.02." + c);
        } else if (a == 28 && b == 2) {
            System.out.println("1.03." + c);
        } else if (a == 31 && b == 3) {
            System.out.println("1.04." + c);
        } else if (a == 30 && b == 4) {
            System.out.println("1.05." + c);
        } else if (a == 31 && b == 5) {
            System.out.println("1.06." + c);
        } else if (a == 30 && b == 6) {
            System.out.println("1.07." + c);
        } else if (a == 31 && b == 7) {
            System.out.println("1.08." + c);
        } else if (a == 31 && b == 8) {
            System.out.println("1.09." + c);
        } else if (a == 30 && b == 9) {
            System.out.println("1.10." + c);
        } else if (a == 31 && b == 10) {
            System.out.println("1.11." + c);
        } else if (a == 30 && b == 11) {
            System.out.println("1.12." + c);
        } else if (a == 31 && b == 12) {
            System.out.println("1.01." + (c = c + 1));
        } else if (a >= 1 && a <= 30 && b>=1 && b<=9) {
            System.out.println((a = a + 1) + "." + "0" + b + "." + c);
        }else if (a >= 1 && a <= 30 && b>=10 && b<=12){
            System.out.println((a = a + 1) + "." + b + "." + c);
        }else{
            System.out.println("Такой даты не существует.");
        }
    }
}

