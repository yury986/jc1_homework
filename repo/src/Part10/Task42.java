package Part10;

import java.util.*;

public class Task42 {
    public static void main(String[] args) {
        Integer numb;
        Integer max;
        Integer e;
        List<Integer> grade = new ArrayList<>(11);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numb = random.nextInt(10);
            grade.add(numb);
        }
        System.out.println(grade);
        Iterator<Integer> iter = grade.iterator();
        max = null;
        while (iter.hasNext()) {
            if (max==null){
                max = iter.next();
            }else{
                e = iter.next();
                if (e.compareTo(max)>0){
                    max = e;
                }
            }
        }
            System.out.println(max);
    }
}
