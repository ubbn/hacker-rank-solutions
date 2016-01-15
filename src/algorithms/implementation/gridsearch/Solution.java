package algorithms.implementation.gridsearch;

import java.util.Scanner;

/**
 * Created by buyan on 30/12/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        byte testCases = stdin.nextByte();
        TestCases:
        while(testCases-->0) {
            int rowsBig = stdin.nextInt();
            int colsBig = stdin.nextInt();
            char matrixBig[][] = new char[rowsBig][colsBig];
            for (int r = 0; r < rowsBig; r++){
                String row = stdin.next();
                for (int c = 0; c < colsBig; c++)
                    matrixBig[r][c] = row.charAt(c);
            }

            int rowsSmall = stdin.nextInt();
            int colsSmall = stdin.nextInt();
            char matrixSmall[][] = new char[rowsSmall][colsSmall];
            for (int r = 0; r < rowsSmall; r++){
                String row = stdin.next();
                for (int c = 0; c < colsSmall; c++)
                    matrixSmall[r][c] = row.charAt(c);
            }

            for (int r = 0; r <= rowsBig-rowsSmall; r++) {
                column:
                for (int c = 0; c <= colsBig-colsSmall; c++) {
                    int rowBig = r;
                    int rowSmall = 0;

                    do {
                        int colBig = c;
                        int colSmall = 0;
                        while (colSmall < colsSmall && matrixBig[rowBig][colBig] == matrixSmall[rowSmall][colSmall]){
                            colBig++;
                            colSmall++;
                        }

                        if (colSmall < colsSmall)
                            continue column;

                        rowSmall++;
                        rowBig++;
                    } while(rowSmall < rowsSmall);
                    System.out.println("YES");
                    continue TestCases;
                }
            }
            System.out.println("NO");
        }
        stdin.close();
    }
}
