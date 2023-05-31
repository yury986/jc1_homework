package part13.task54;

public class Main {
    public static void main(String[] args) {

    for (int i = 1; i<=10; i++) {
        Thread threadMax = new Thread(new ThreadMax(), "Thread:" + i);
        threadMax.start();
    }
    }
}
