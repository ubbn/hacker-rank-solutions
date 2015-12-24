package algorithms.warmup.simplearraysum;

import java.util.Scanner;

/**
 * Created by bb on 12/24/15.
 */
public class Solution {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner stdin = new Scanner(System.in);
        number = stdin.nextInt();
        for (int i=0; i < number; i++)
        {
            sum += stdin.nextInt();
        }
        stdin.close();

        System.out.println(sum);
    }
}
