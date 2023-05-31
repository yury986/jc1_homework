package part14.task58;


import java.util.LinkedList;
import java.util.Queue;

public class Turn {

    private static Turn turn = new Turn();

    Queue<Integer> queue = new LinkedList<>();


    private Turn() {
    }

    public static Turn getInstance() {
        return turn;
    }

    public void addGood(Integer num) {
        synchronized (queue) {
            while (queue.size() >= 100) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.notifyAll();
            queue.add(num);
            System.out.println(Thread.currentThread().getName() + " adds " + num + ". Have [" + queue.size() + "]");
        }
    }



    public int takeGood() {
        synchronized (queue) {
            while (queue.size() == 0) {
                try {
                    queue.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.notifyAll();
            int num = queue.remove();





            System.out.println(Thread.currentThread().getName() + " takes " + num + ". Have [" + queue.size() + "]");
            return num;
        }
    }



}



