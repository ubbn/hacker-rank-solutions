package algorithms.sorting.insertionsortpartone;

import java.util.Scanner;

/**
 * Created by buyan on 2/14/16.
 */
public class Solution {
    static void PrintArray(int[] arr){
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    static void insertIntoSorted(int[] arr){
        if (arr.length < 2)
            return;

        int index = arr.length - 1;
        int lastValue = arr[index];
        while(--index >= 0){
            if (arr[index] > lastValue){
                arr[index+1] = arr[index];
                if (index == 0){
                    PrintArray(arr);
                    arr[index] = lastValue;
                }
            }
            else{
                arr[index+1] = lastValue;
                index = 0;
            }

            PrintArray(arr);
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
        insertIntoSorted(array);

        stdin.close();
    }
}
