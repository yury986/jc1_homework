package part14.task57;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        final Object resource1 = "resource1";
        final Object resource2 = "resource2";
        final Object resource3 = "resource3";

        Thread t1 = new Thread(new SyncThread(resource1,resource2 ), "t1");
        Thread t2 = new Thread(new SyncThread(resource2, resource3), "t2");
        Thread t3 = new Thread(new SyncThread(resource3, resource1), "t3");

        t1.start();
        Thread.sleep(5000);
        t2.start();
        Thread.sleep(5000);
        t3.start();

    }
}
