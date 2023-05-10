package Part10;

import java.util.*;

public class Task41 {

    public static void main(String[] args) {
        int numb;
    List<Integer> grade = new ArrayList <> (10);

        Random random = new Random();
        for (int i = 0; i<10; i++){
            numb = random.nextInt(10);
            grade.add(numb);
            }
        System.out.println(grade);
        Set<Integer> set = new HashSet<>(grade);
        System.out.println(set);
        }
    }

