package part15.task61;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.concurrent.*;

public class CallDate implements Callable {



    @Override
    public synchronized Object call() throws Exception {
        File file = new File("date.txt");
        String s = Thread.currentThread().getName() + " " + " выполняет работу";
        Date date = new Date();
        try (OutputStream outputStream = new FileOutputStream(file,true);

             BufferedOutputStream bos = new BufferedOutputStream(outputStream)) {

            bos.write(("HelloWorld" + " " + date + "\n").getBytes());
            bos.flush();
        }
        Thread.sleep(5000);
        return file + " " + s;

    }
}


