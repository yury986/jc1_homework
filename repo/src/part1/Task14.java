package part1;

import java.lang.*;
import java.math.*;
public class Task14{
    public static void main(String[] args) {
        int value =25;
        BigInteger s = BigInteger.valueOf(1);
        for (long i = 1; i <= value; i++){
            BigInteger i2 = BigInteger.valueOf(i);
            s = s.multiply(i2);
        }
        System.out.println(s);
    }
}
