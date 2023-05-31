package part14.task57;

public class SyncThread implements Runnable {
    private Object resource1;
    private Object resource2;

    public SyncThread(Object resource1, Object resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " get lock on "+resource1);
        synchronized (resource1) {
            System.out.println(name + " get lock on "+resource1);
            work();
            System.out.println(name + " get lock on "+resource2);
            synchronized (resource2) {
                System.out.println(name + " get lock on "+resource2);
                work();
            }
            System.out.println(name + " get lock on "+resource2);
        }
        System.out.println(name + " get lock on "+resource1);
        System.out.println(name + " finished execution.");
    }
    private void work() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

