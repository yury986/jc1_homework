package part1;

public class Task18 {
    public static void main(String[] args) {
        int a = 20023143;
        int f = a;
        int c = 1;
        int b;
        int res = 0;
        while (a!=0){
           ++ res;
           a/=1000;
        }

        for (int j = 0; j< res; j++){
            c*=1000;
        }

        for (int i = 0; i<res; i++) {
            b = (f % c) / (c / 1000);
            c = c / 1000;

            System.out.print(b + " ");
        }

        }
    }


