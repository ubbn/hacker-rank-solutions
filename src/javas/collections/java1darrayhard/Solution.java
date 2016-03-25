package javas.collections.java1darrayhard;

import java.util.Scanner;

/**
 * Created by buyan on 3/25/16.
 */
public class Solution {
    static boolean canJumpOut(int a[], boolean movingForward, int position, int jumpStep){
        System.out.println(position);
        if (position >= a.length)
            return true;
        else if (a[position] == 1 || position < 0)
            return false;
        else {
            boolean canJumpOut = false;

            if (movingForward) {
                // One step forward
                if (position + 1 >= a.length)
                    return true;
                else if (a[position + 1] == 0)
                    canJumpOut = canJumpOut(a, true, position + 1, jumpStep);
                else
                    canJumpOut = false;
            }

            // Jumpstep forward
            if (canJumpOut)
                return true;
            else if (position + jumpStep >= a.length)
                return true;
            else if (a[position + jumpStep] == 0)
                canJumpOut = canJumpOut(a, true, position + jumpStep, jumpStep);
            else
                canJumpOut = false;

            // One step backward
            if (canJumpOut)
                return true;
            else if (position - 1 < 0)
                return false;
            else if (a[position - 1] == 0)
                return canJumpOut(a, false, position - 1, jumpStep);
            else
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        while (testCases-->0){
            int n = stdin.nextInt();
            int m = stdin.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = stdin.nextInt();

            if (canJumpOut(a, true, 0, m))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        stdin.close();
    }
}