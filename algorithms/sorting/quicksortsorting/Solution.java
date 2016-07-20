package algorithms.sorting.quicksortsorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by bbn on 2/20/16.
 */
public class Solution {
    static void printList(List<Integer> listOfNumber){
        for (int number : listOfNumber)
            System.out.print(number + " ");
        System.out.println();
    }

    static List<Integer> quickSort(List<Integer> numList){
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();

        int pivot = numList.get(0);
        equal.add(pivot);

        for (int i = 1; i < numList.size(); i++){
            int temp = numList.get(i);
            if (pivot == temp)
                equal.add(temp);
            else if (pivot > temp)
                left.add(temp);
            else
                right.add(temp);
        }

        if (left.size() > 1) {
            left = quickSort(left);
        }
        if (right.size() > 1) {
            right = quickSort(right);
        }

        left.addAll(equal);
        left.addAll(right);
        printList(left);
        return left;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int sizeOfArray = stdin.nextInt();
        List<Integer> numList = new ArrayList<>();

        while (sizeOfArray-->0)
            numList.add(stdin.nextInt());

        quickSort(numList);

        stdin.close();
    }

}
