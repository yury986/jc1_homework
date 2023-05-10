package Part10;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;


public class Task40 {
    public static void main(String[] args) {
        int numb;
        List<Integer> grade = new ArrayList <> (10);

        Random random = new Random();
        for (int i = 0; i<10; i++){
            numb = random.nextInt(10);
            grade.add(numb);
        }
        System.out.println(grade);

        for (Iterator<Integer> iterator = grade.iterator(); iterator.hasNext(); )
            if (iterator.next() < 4){
                iterator.remove();
           }
            System.out.println(grade);
    }
}

