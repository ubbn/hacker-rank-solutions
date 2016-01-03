package algorithms.warmup.staircase;

import java.util.Scanner;

/**
 * Created by bb on 12/25/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int level = stdin.nextInt();
        for(int i=0; i < level; i++){
            for(int j=0; j < level; j++){
                if (j >= level - 1 -i)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        stdin.close();
    }
}
