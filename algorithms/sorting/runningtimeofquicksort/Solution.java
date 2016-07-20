package algorithms.sorting.runningtimeofquicksort;

import java.util.Scanner;

/**
 * Created by bbn on 2/27/16.
 */
public class Solution {
    static int quickSortShifts;

    static int insertionSort(int[] array){
        int shifts = 0;

        int index = 1;
        while(index < array.length){
            int temp = array[index];
            int j = index - 1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
                shifts++;
            }
            array[j+1] = temp;

            index++;
        }

        return shifts;
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
                quickSortShifts++;
            }
        }

        array[endIndex] = array[pivotIndex];
        array[pivotIndex] = pivot;
        quickSortShifts++;

        return pivotIndex;
    }

    static void quickSort(int[] array, int startIndex, int endIndex){
        if (startIndex >= endIndex)
            return;

        int pivotIndex = partition(array, startIndex, endIndex);
        quickSort(array, startIndex, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, endIndex);

    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int sizeOfArray = stdin.nextInt();
        int[] originalArray = new int[sizeOfArray];
        int[] copiedArray = new int[sizeOfArray];

        // Read the array
        for (int i = 0; i < sizeOfArray; i++)
            originalArray[i] = stdin.nextInt();

        // Copy original array for second sort
        System.arraycopy(originalArray, 0, copiedArray, 0, sizeOfArray);

        int insertionSortShifts = insertionSort(originalArray);
        quickSort(copiedArray,0,sizeOfArray-1);

        System.out.println(insertionSortShifts - quickSortShifts);
        stdin.close();
    }
}
