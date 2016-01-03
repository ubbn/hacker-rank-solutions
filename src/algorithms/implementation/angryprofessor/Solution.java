package algorithms.implementation.angryprofessor;

import java.util.Scanner;

/**
 * Created by bb on 12/25/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        for (int i = 0; i < testCases; i++) {
            int students = stdin.nextInt();
            int threshold = stdin.nextInt();

            int goodStudents = 0;
            for (int j = 0; j < students; j++)
                if (stdin.nextInt() <= 0)
                    goodStudents++;

            if (goodStudents >= threshold)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        stdin.close();
    }
}
