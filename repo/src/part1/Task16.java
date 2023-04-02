package part1;

public class Task16 {
    public static void main(String[] args) {
        int c = 0;
        for ( int i = 50; i<=70; i++){
            if (!(i%2==0 || i%3==0)){
                c=c+1;
                if (c==2){
                    break;
                }
                System.out.println(i);
            }
        }
    }
}
