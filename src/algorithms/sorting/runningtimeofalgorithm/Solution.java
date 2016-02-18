package algorithms.sorting.runningtimeofalgorithm;

import java.util.Scanner;

/**
 * Created by buyan on 2/18/16.
 */
public class Solution {
    static void insertionSort(int[] array){
        if (array.length < 2)
            return;

        int shiftCount = 0;

        int index = 1;
        while(index < array.length){
            int temp = array[index];
            int j = index - 1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                shiftCount++;
                j--;
            }
            array[j+1] = temp;

            index++;
        }

        System.out.println(shiftCount);
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int sizeOfArray = stdin.nextInt();
        int[] array = new int[sizeOfArray];

        // Read the array
        for (int i = 0; i < sizeOfArray; i++)
            array[i] = stdin.nextInt();

        // Start sorting
        insertionSort(array);

        stdin.close();
    }


}
