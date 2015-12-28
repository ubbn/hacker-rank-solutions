package algorithms.implementation.servicelane;

import java.util.Scanner;

/**
 * Created by buyan on 28/12/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int segmentNumber = stdin.nextInt();
        int testCases = stdin.nextInt();

        int segments[] = new int[segmentNumber];
        for (int j = 0; j < segmentNumber; j++) {
            segments[j] = stdin.nextInt();
        }

        for (int i = 0; i < testCases; i++) {
            int entry = stdin.nextInt();
            int exit = stdin.nextInt();

            int vehicleWidth = segments[exit];
            for (int k = entry; k < exit; k++) {
                if (vehicleWidth > segments[k])
                    vehicleWidth = segments[k];
            }

            System.out.println(vehicleWidth);
        }
    }
}
