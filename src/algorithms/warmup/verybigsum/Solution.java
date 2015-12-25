package algorithms.warmup.verybigsum;

import java.util.Scanner;

/**
 * Created by bb on 12/24/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int totalNumber = stdin.nextInt();
        long sum = 0;
        for (int i=0; i < totalNumber; i++)
        {
            sum += stdin.nextLong();
        }

        System.out.println(sum);
        stdin.close();
    }
}
