package part14.task58;


public class Main {
    public static void main(String[] args) {

        new Producer("1").start();
        new Producer("2").start();
        new Producer("3").start();
        new Consumer("1").start();
        new Consumer("2").start();
    }

}
