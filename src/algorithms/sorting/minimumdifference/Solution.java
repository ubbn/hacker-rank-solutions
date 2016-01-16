package algorithms.sorting.minimumdifference;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by buyan on 1/16/16.
 */
public class Solution {
    static int[] quickSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int pointer = arr[i];
            int j = i-1;
            while(j >= 0 && pointer < arr[j])
                arr[j+1] = arr[j--];

            arr[j+1] = pointer;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int number = stdin.nextInt();
        if (number < 2)
            return;

        int arr[] = new int[number];
        stdin.nextLine();
        int i = number;
        while(i>0)
            arr[number-i--] = stdin.nextInt();

        int sorted[] = quickSort(arr);
        ArrayList<Integer> minIndexes = new ArrayList<>();
        int minDiff = Math.abs(sorted[1]-sorted[0]);
        for (int j = 1; j < number; j++) {
            int diff = Math.abs(sorted[j-1]-sorted[j]);
            if (minDiff > diff){
                minDiff = diff;
                minIndexes.clear();
                minIndexes.add(j);
            }
            else if (minDiff == diff)
                minIndexes.add(j);
        }

        for (int index : minIndexes)
            System.out.print(sorted[index-1] + " " + sorted[index] + " ");
    }
}
