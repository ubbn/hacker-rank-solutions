package algorithms.implementation.utopiantree;

import java.util.Scanner;

/**
 * Created by bb on 12/26/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        while(testCases-->0) {
            int cycles = stdin.nextInt();
            int treeLength = 1;
            for (int j = 0; j < cycles; j++) {
                if (j % 2 == 0)
                    treeLength *= 2;
                else
                    treeLength += 1;
            }
            System.out.println(treeLength);
        }
        stdin.close();
    }
}
