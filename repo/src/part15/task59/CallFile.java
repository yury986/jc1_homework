package part15.task59;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

public class CallFile implements Callable {


    @Override
    public synchronized Object call() throws Exception {
        String threadName = Thread.currentThread().getName();
        List<String> fileList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            String fileName = threadName + " " + i + ".txt";
            fileList.add(fileName);


            try (OutputStream outputStream = new FileOutputStream(fileName);

                 BufferedOutputStream bos = new BufferedOutputStream(outputStream)) {

                bos.write(("HelloWorld" + i).getBytes());
                bos.flush();
            }
        }
            Thread.sleep(5000);
            return fileList;
        }
    }

