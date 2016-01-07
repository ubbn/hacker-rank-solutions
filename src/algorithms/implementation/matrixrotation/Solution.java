package algorithms.implementation.matrixrotation;

import java.util.Scanner;

/**
 * Created by buyan on 31/12/15.
 */
public class Solution {
    enum Sides {
        TOP,
        LEFT,
        BOTTOM,
        RIGHT
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        short row = stdin.nextShort();
        short col = stdin.nextShort();
        int rotate = stdin.nextInt();
        int matrix[][] = new int[row][col];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                matrix[i][j] = stdin.nextInt();

        for (int i = 0; i < row; i++){
            int rowTop = i;
            int rowBottom = i;
            for (int j = 0; j < col; j++){




            }

        }






        stdin.close();
    }
}
