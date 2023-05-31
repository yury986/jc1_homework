package part14.task56;

public class ThreadName implements Runnable {

    GetName name;

    ThreadName(GetName name) {
        this.name = name;
    }

    @Override
    public void run() {
    name.getName();
    }
}
