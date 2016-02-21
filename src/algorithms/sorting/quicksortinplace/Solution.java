package algorithms.sorting.quicksortinplace;

import java.util.*;

/**
 * Created by bbn on 2/21/16.
 */
public class Solution {
    static void printArray(int[] array, int[] indexes){
        for (int index : indexes)
            System.out.print(array[index] + " ");
        System.out.println();
    }

    static void partition(int[] data, int[] indexes){
        Queue<Integer> greaters = new LinkedList<>();
        int pivot = data[indexes[indexes.length-1]];

        for (int i = 0; i < indexes.length-1; i++){
            if (data[indexes[i]] >= pivot)
                greaters.add(i);
            else{
                if (greaters.size() > 0){
                    int firstGeaterIndex = greaters.poll();
                    int temp = indexes[i];
                    indexes[i] = indexes[firstGeaterIndex];
                    indexes[firstGeaterIndex] = temp;
                }

            }
        }

        if (!greaters.isEmpty()){
            int firstGeaterIndex = greaters.poll();
            int temp = indexes[indexes.length-1];
            indexes[indexes.length-1] = indexes[firstGeaterIndex];
            indexes[firstGeaterIndex] = temp;

            printArray(data, indexes);
            partition(data, indexes);
        }

    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int sizeOfArray = stdin.nextInt();
        int[] numList = new int[sizeOfArray];
        int[] indexes = new int[sizeOfArray];


        for (int i = 0; i < sizeOfArray; i++) {
            numList[i] = stdin.nextInt();
            indexes[i] = i;
        }

        partition(numList, indexes);

        stdin.close();
    }


}
