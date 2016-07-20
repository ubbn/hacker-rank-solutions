package algorithms.implementation.kaprekarnumbers;

import java.util.Scanner;

/**
 * Created by buyan on 02/01/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int p = stdin.nextInt();
        int q = stdin.nextInt();
        boolean isFound = false;

        for (long i = p; i <= q; i++) {
            int numberOfDigits = (int)(Math.log10(i) + 1);
            long sqrt = i * i;
            int tens = (int)Math.pow(10, numberOfDigits);
            if ((sqrt / tens + sqrt % tens) == i) {
                System.out.print(i + " ");
                isFound = true;
            }
        }
        if (!isFound)
            System.out.println("INVALID RANGE");
        stdin.close();
    }
}
