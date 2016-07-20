package algorithms.implementation.matrixrotation;

import java.util.Scanner;

/**
 * Created by buyan on 31/12/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        short row = stdin.nextShort();
        short col = stdin.nextShort();
        int rotate = stdin.nextInt();
        int matrix[][] = new int[row][col];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                matrix[i][j] = stdin.nextInt();

        for (int r = 0; r < row; r++){
            for (int c = 0; c < col; c++){
                int edgeRow = (r < row/2) ? r : row-1-r;
                int edgeCol = (c < col/2) ? c : col-1-c;
                int layer = Math.min(edgeRow, edgeCol);

                int rowLen = col - 2 * layer;
                int colLen = row - 2 * layer;
                int remainder = rotate % ((colLen + rowLen - 2) * 2);

                // UP
                if (r < row/2 && layer == r){
                    int d = (col-1 - layer) - c;
                    if (d >= remainder)
                        System.out.print(matrix[r][c+remainder] + " ");
                    else
                    if (colLen > remainder-d)
                        System.out.print(matrix[r+remainder-d][col-1-layer] + " ");
                    else
                    if (rowLen > remainder-d-colLen+1)
                        System.out.print(matrix[row-1-layer][col-1-layer-(remainder-d-colLen+1)] + " ");
                    else
                    if (colLen > remainder-d-colLen-rowLen+2)
                        System.out.print(matrix[row-1-layer-(remainder-d-colLen-rowLen+2)][layer] + " ");
                    else
                        System.out.print(matrix[r][layer+(remainder-d-2*colLen-rowLen+3)] + " ");
                }
                // LEFT
                else if (c < col/2 && layer == c){
                    int d = r - layer;
                    if (d >= remainder)
                        System.out.print(matrix[r-remainder][c] + " ");
                    else
                    if (rowLen > remainder-d)
                        System.out.print(matrix[layer][layer+remainder-d] + " ");
                    else
                    if (colLen > remainder-d-rowLen+1)
                        System.out.print(matrix[layer+remainder-d-rowLen+1][col-1-layer] + " ");
                    else
                    if (rowLen > remainder-d-rowLen-colLen+2)
                        System.out.print(matrix[row-1-layer][col-1-layer-(remainder-d-colLen-rowLen+2)] + " ");
                    else
                        System.out.print(matrix[row-1-layer-(remainder-d-colLen-2*rowLen+3)][c] + " ");
                }
                // DOWN
                else if (r >= row/2 && layer == row-1 - r){
                    int d = c - layer;
                    if (d >= remainder)
                        System.out.print(matrix[r][c-remainder] + " ");
                    else
                    if (colLen > remainder-d)
                        System.out.print(matrix[row-1-layer-(remainder-d)][layer] + " ");
                    else
                    if (rowLen > remainder-d-colLen+1)
                        System.out.print(matrix[layer][layer+(remainder-d-colLen+1)] + " ");
                    else
                    if (colLen > remainder-d-colLen-rowLen+2)
                        System.out.print(matrix[layer+(remainder-d-colLen-rowLen+2)][col-1-layer] + " ");
                    else
                        System.out.print(matrix[r][col-1-layer-(remainder-d-2*colLen-rowLen+3)] + " ");
                }
                // RIGHT
                else if (c >= col/2 && layer == col-1 - c){
                    int d = row-1 - layer - r;
                    if (d >= remainder)
                        System.out.print(matrix[r+remainder][c] + " ");
                    else
                    if (rowLen > remainder-d)
                        System.out.print(matrix[row-1-layer][col-1-layer-(remainder-d)] + " ");
                    else
                    if (colLen > remainder-d-rowLen+1)
                        System.out.print(matrix[row-1-layer-(remainder-d-rowLen+1)][layer] + " ");
                    else
                    if (rowLen > remainder-d-rowLen-colLen+2)
                        System.out.print(matrix[layer][layer+(remainder-d-colLen-rowLen+2)] + " ");
                    else
                        System.out.print(matrix[layer+(remainder-d-colLen-2*rowLen+3)][c] + " ");
                }
            }
            System.out.println();
        }
        stdin.close();
    }
}
