package part12;

import java.io.File;

public class task47 {
    public static void main(String[] args) {
        try {
            File dir = new File("C:/jc1_homework/repo/");
            if (dir.exists()) {
                System.out.println("Папка существует");
            } else {
                System.out.println("Папка не существует");
            }

            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + "каталог");
                }
            }
            for (File item2 : dir.listFiles()) {
                if (item2.isFile()) {
                    System.out.println(item2.getName() + "файл");
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
