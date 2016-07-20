package algorithms.implementation.libraryfine;

import java.util.Scanner;

/**
 * Created by buyan on 05/01/16.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int d1 = stdin.nextInt();
        int m1 = stdin.nextInt();
        int y1 = stdin.nextInt();
        int d2 = stdin.nextInt();
        int m2 = stdin.nextInt();
        int y2 = stdin.nextInt();

        if (y1 > y2)
            System.out.println(10000);
        else if (y1 < y2)
            System.out.println(0);
        else if (m1 > m2)
            System.out.println(500 * (m1 - m2));
        else if (m1 < m2)
            System.out.println(0);
        else if (d1 > d2)
            System.out.println(15 * (d1 - d2));
        else
            System.out.println(0);

        stdin.close();
    }
}
