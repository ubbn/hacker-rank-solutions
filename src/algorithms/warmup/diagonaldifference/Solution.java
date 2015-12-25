package algorithms.warmup.diagonaldifference;

import java.util.Scanner;

/**
 * Created by buyan on 12/25/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int dimension = stdin.nextInt();
        long sumOnPrimaryDiagonal = 0;
        long sumOnSecondDiagonal = 0;
        for (int i=0; i < dimension; i++){
            for (int j=0; j < dimension; j++){
                int value = stdin.nextInt();
                if (i == j)
                    sumOnPrimaryDiagonal += value;

                if (i + j == dimension - 1)
                    sumOnSecondDiagonal += value;
            }

        }
        stdin.close();

        System.out.println(Math.abs(sumOnPrimaryDiagonal - sumOnSecondDiagonal));
    }
}
