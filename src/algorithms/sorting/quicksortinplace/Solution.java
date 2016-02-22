package algorithms.sorting.quicksortinplace;

import java.util.*;

/**
 * Created by bbn on 2/21/16.
 */
public class Solution {
    static void printArray(int[] array){
        for (int value : array)
            System.out.print(value + " ");
        System.out.println();
    }

    static int partition(int[] array, int startIndex, int endIndex){
        int pivot = array[endIndex];

        int pivotIndex = startIndex;
        for (int i = startIndex; i < endIndex; i++) {
            if (array[i] <= pivot){
                int temp = array[pivotIndex];
                array[pivotIndex] = array[i];
                array[i] = temp;

                pivotIndex++;
            }
        }

        array[endIndex] = array[pivotIndex];
        array[pivotIndex] = pivot;

        return pivotIndex;
    }

    static void quickSort(int[] array, int startIndex, int endIndex){
        if (startIndex >= endIndex)
            return;

        int pivotIndex = partition(array, startIndex, endIndex);
        printArray(array);
        quickSort(array, startIndex, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, endIndex);

    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int sizeOfArray = stdin.nextInt();
        int[] numList = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++)
            numList[i] = stdin.nextInt();

        quickSort(numList, 0, sizeOfArray - 1);

        stdin.close();
    }

}
