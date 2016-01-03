package algorithms.implementation.cutthesticks;

import java.util.Scanner;

/**
 * Created by bb on 12/29/15.
 * here could use sorting, but that's more complicated than this simple solution
 * which is faster when @numberOfSticks grows close to limit
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int numberOfSticks = stdin.nextInt();
        int count[] = new int[1000];

        for (int i = 0; i < numberOfSticks; i++)
            count[stdin.nextInt()]++;

        for (int i = 0; i < 1000; i++)
            if (count[i] > 0){
                System.out.println(numberOfSticks);
                numberOfSticks -= count[i];
            }
        stdin.close();
    }
}
