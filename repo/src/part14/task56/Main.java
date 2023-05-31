package part14.task56;

public class Main {
    public static void main(String[] args) {

        GetName getName = new GetName();

        for (int i = 1; i<11; i++ ){
            Thread t = new Thread(new ThreadName(getName));
            t.setName("Thread" +i);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
