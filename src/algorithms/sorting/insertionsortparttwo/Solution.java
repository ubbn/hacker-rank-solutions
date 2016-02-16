package algorithms.sorting.insertionsortparttwo;

import java.util.Scanner;

/**
 * Created by bbn on 2/16/16.
 */
public class Solution {
    static void PrintArray(int[] arr){
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    static void insertionSortPart2(int[] array){
        if (array.length < 2)
            return;

        int index = 1;
        while(index < array.length){
            int temp = array[index];
            int j = index - 1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;

            index++;
            PrintArray(array);
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int sizeOfArray = stdin.nextInt();
        int[] array = new int[sizeOfArray];

        // Read the array
        for (int i = 0; i < sizeOfArray; i++)
            array[i] = stdin.nextInt();

        // Start sorting and print resulted array on every step
        insertionSortPart2(array);

        stdin.close();
    }
}
