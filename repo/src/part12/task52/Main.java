package part12.task52;


import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Person [] humans = new Person[10];
        for (int i = 0; i< humans.length; i++){
            humans [i] = new Person();
        }
        System.out.println(Arrays.toString(humans));

        try {
            String destFileName = String.valueOf(new File("person.txt"));
            System.out.println("Save to " + destFileName);
            for (int i = 0; i< humans.length; i++) {
                boolean result = new PersonWriter().writeToFile(humans[i], destFileName);
                if (result) {
                    System.out.println("Saved person:" + i + "to file successfully");
                } else {
                    System.out.println("Saved person:" + i + "to file failure");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
