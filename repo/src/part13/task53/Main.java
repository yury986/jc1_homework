package part13.task53;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            ThreadTen threadTen = new ThreadTen("Thread" + i);
            threadTen.start();
            try {
                threadTen.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
