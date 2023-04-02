package part1;

public class Task15 {
    public static void main(String[] args) {
        long sum = 0;
        long i = 7893823445l;
        do{
            sum += (i%10);
            i/=10;
        }while (i!=0);
        System.out.println(sum);
    }
}
