package part1;

public class Task16 {
    public static void main(String[] args) {
        int sum =0;
        boolean b = true;
        for (int P = 50; P <= 70; P++) {
            for (int i = 2; i < P; i++) {
                if  (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                sum = sum+1;
            }
            if(sum == 2){
                System.out.println(P);
                System.exit(0);
            }else b = true;

        }
    }
}

