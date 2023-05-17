package Part11.task45;

public class Main {
    public static void main(String[] args){

        try{
            int result = Factorial.getFactorial(-1);
            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}
