package part14.task58;


import java.util.Random;

public class Producer extends Thread {

    public Producer(String name) {
        super("Producer" + name);
    }

    private int sum = 0;


    @Override
    public void run() {
        Random random = new Random();
        Turn turn = Turn.getInstance();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            turn.addGood(num);
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
