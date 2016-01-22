package datastructure.arrays.arrayds;

import java.util.Scanner;

/**
 * Created by buyan on 1/22/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int arr[] = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = stdin.nextInt();

        for(int i=0; i < n; i++)
            System.out.print(arr[n-1-i] + " ");

        stdin.close();
    }
}