package algorithms.implementation.manasastones;

import java.util.Scanner;

/**
 * Created by buyan on 04/01/16.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        for (int i = 0; i < testCases; i++) {
            int stones = stdin.nextInt();
            int diffOne = stdin.nextInt();
            int diffTwo = stdin.nextInt();

            int base = (stones - 1) * Math.min(diffOne, diffTwo);
            if (diffOne == diffTwo)
                stones = 1;
            for (int j = 0; j < stones; j++)
                System.out.print(base + j * Math.abs(diffOne-diffTwo) + " ");

            System.out.println();
        }
        stdin.close();
    }
}
