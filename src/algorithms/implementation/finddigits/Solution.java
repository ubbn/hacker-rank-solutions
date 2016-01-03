package algorithms.implementation.finddigits;

import java.util.Scanner;

/**
 * Created by bb on 12/26/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();
        for (int i = 0; i < testCases; i++) {
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
