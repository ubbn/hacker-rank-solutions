package javas.collections.java1darrayhard;

import java.util.Scanner;

/**
 * Created by buyan on 3/25/16.
 */
public class Solution {
    static boolean canJumpOut(int a[], int visited[], boolean movingForward, int position, int jumpStep){
        if (position >= a.length)
            return true;
        else if (position < 0 || a[position] == 1)
            return false;
        else if (visited[position] != 0 && movingForward)
            return false;
        else {
            boolean canJumpOut = false;
            visited[position] = 1;

            if (movingForward)
                canJumpOut = canJumpOut(a, visited, true, position + 1, jumpStep);

            if (!canJumpOut)
                canJumpOut = canJumpOut(a, visited, true, position + jumpStep, jumpStep);

            if (!canJumpOut)
                canJumpOut = canJumpOut(a, visited, false, position - 1, jumpStep);

            return canJumpOut;
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        while (testCases-->0){
            int n = stdin.nextInt();
            int m = stdin.nextInt();
            int a[] = new int[n];
            int visited[] = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = stdin.nextInt();

            if (canJumpOut(a, visited, true, 0, m))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        stdin.close();
    }
}