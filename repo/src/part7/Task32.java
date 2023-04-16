package part7;

public class Task32 {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        String str1 = " ";
        StringBuilder sb = new StringBuilder("aaabbbccc");
        long startTime = System.nanoTime();
        for (int i = 0; i<=100000; i++){
            str1 = str1 +str;
        }
        long endTime = System.nanoTime();
        long diffTime = endTime - startTime;
        System.out.println(diffTime);
        long startTime1 = System.nanoTime();
        for(int i = 0; i <= 100000; i++) {
            sb.append(i);
        }
        long endTime1 = System.nanoTime();
        long diffTime1 = endTime1 - startTime1;
        System.out.println(diffTime1);
        System.out.println("Метод append быстрее оператора +" + " " + "на" + " " + (diffTime-diffTime1)*10e-10 + " " + "секунд");
    }
}
