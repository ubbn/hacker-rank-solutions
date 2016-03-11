package javas.collections.negativesubarray;

import java.util.Scanner;

/**
 * Created by buyan on 3/11/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int sizeOfArray = stdin.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = stdin.nextInt();
        }

        int totalNegativeSubArray = 0;

        for (int i = 0; i < sizeOfArray; i++) {
            int sum = 0;
            for (int j = i; j < sizeOfArray; j++) {
                sum += array[j];
                if (sum < 0)
                    totalNegativeSubArray++;
            }
        }

        System.out.println(totalNegativeSubArray);
        stdin.close();
    }
}