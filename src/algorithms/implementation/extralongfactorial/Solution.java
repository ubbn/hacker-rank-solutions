package algorithms.implementation.extralongfactorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by bb on 12/27/15.
 */
public class Solution {
    public static BigInteger Factorial(int number){
        if (number <= 1)
            return BigInteger.valueOf(1);
        return BigInteger.valueOf(number).multiply(Factorial(number-1));
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int number = stdin.nextInt();
        System.out.println(Factorial(number));
    }
}
