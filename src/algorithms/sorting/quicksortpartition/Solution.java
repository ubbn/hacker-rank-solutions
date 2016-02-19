package algorithms.sorting.quicksortpartition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by bbn on 2/19/16.
 */
public class Solution {
    static void printList(List<Integer> listOfNumber){
        for (int number : listOfNumber)
            System.out.print(number + " ");
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();

        int sizeOfArray = stdin.nextInt();
        int initValue = stdin.nextInt();
        equal.add(initValue);

        for (int i = 1; i < sizeOfArray; i++){
            int temp = stdin.nextInt();
            if (initValue == temp)
                equal.add(temp);
            else if (initValue > temp)
                left.add(temp);
            else
                right.add(temp);
        }

        printList(left);
        printList(equal);
        printList(right);

        stdin.close();
    }
}
