package algorithms.warmup.plusminus;

import java.util.Scanner;

/**
 * Created by bb on 12/25/15.
 */
public class Solution {
    public static void PrintOutput(int a, int b){
        System.out.println(String.format("%.6f", a/(double)b));
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int totalNumber = stdin.nextInt();
        int counterPos = 0;
        int counterNeg = 0;

        for (int i=0; i < totalNumber; i++){
            int value = stdin.nextInt();
            if (value > 0)
                counterPos++;
            else if (value < 0)
                counterNeg++;
        }

        PrintOutput(counterPos, totalNumber);
        PrintOutput(counterNeg, totalNumber);
        PrintOutput(totalNumber - counterPos - counterNeg, totalNumber);
    }
}
