package Part11.task46;

import static Part11.task46.Factorial.getFactorial;

public class Main {

    public static void main(String[] args){

        try{
            int result = getFactorial(-6);

            System.out.println(result);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
