package algorithms.implementation.sherlockandsquare;

import java.util.Scanner;

/**
 * Created by bb on 12/26/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        while(testCases-->0) {
            int numStart = stdin.nextInt();
            int numEnd = stdin.nextInt();

            System.out.println((int)(Math.floor(Math.sqrt(numEnd)) - Math.ceil(Math.sqrt(numStart)) + 1));
        }
        stdin.close();
    }
}
