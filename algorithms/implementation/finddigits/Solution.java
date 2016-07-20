package algorithms.implementation.finddigits;

import java.util.Scanner;

/**
 * Created by buyan on 12/26/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();
        while(testCases-->0) {
            int number = stdin.nextInt();

            int temp = number;
            int count = 0;
            do {
                int digit = temp % 10;
                if (digit > 0 && number % digit == 0)
                    count++;
                temp = (temp - digit) / 10;
            } while(temp > 0);

            System.out.println(count);
        }
        stdin.close();
    }
}
