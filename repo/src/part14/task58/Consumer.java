package part14.task58;


public class Consumer extends Thread {

    public Consumer(String name) {
        super("Consumer" + name);
    }
    private int sum = 0;
    @Override
    public void run() {
        Turn turn = Turn.getInstance();
        while (true) {
            turn.takeGood();
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum++;
        }
    }

    public int Sum() {
        return sum;
    }
}
