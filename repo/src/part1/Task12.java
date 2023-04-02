package part1;

public class Task12 {
    public static void main(String[] args) {
       int n = 2;
        day (n);
    }

    static int day (int n) {

        switch (n) {
            case 1:
                System.out.println("Понедельник: отдых после выходных.");
                break;
            case 2:
                System.out.println("Вторник: подготовка к работе.");
                break;
            case 3:
                System.out.println("Среда: работа.");
                break;
            case 4:
                System.out.println("Четверг: отдых после работы.");
                break;
            case 5:
                System.out.println("Пятница: подготовка к выходным.");
                break;
            case 6:
                System.out.println("Суббота: выходной.");
                break;
            case 7:
                System.out.println("Воскресенье: выходной.");
                break;
            default:
                System.out.println("Дня с таким номером не существует.");

        }
        return n;
    }
}
