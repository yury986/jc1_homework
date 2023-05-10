package Part10;

import java.util.HashMap;
import java.util.Scanner;

public class Task43 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String text = sc.nextLine();
        String [] str = text.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i< str.length; i++){
            if (map.containsKey(str[i])) {
                map.put(str[i], map.get(str[i]) +1);
            }else {
                map.put(str[i],1);
            }
        }

        System.out.println(map);
    }
}

