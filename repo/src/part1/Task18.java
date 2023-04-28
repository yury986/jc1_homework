package part1;

public class Task18 {
    public static void main(String[] args) {
            int num = 20023143;
            String str = "";
            int i = 0;
            while (num > 0) {
                int j = num % 10;
                str = j + str;
                num = num / 10;
                i++;
                if (i % 3 == 0 && num != 0) {
                    str = " " + str;
                }
            }
            System.out.println(str);
        }
    }


