package Part11;

public class Task44 {
    public static void main(String[] args) {
        String str = null;
        int length = 0;

        try {
            length = str.length();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println(length);


    }
}
