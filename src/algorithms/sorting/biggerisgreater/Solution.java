package algorithms.sorting.biggerisgreater;

import java.util.Scanner;

/**
 * Created by bbn on 2/23/16.
 */
public class Solution {

    static char[] insertionSort(char[] array){
        int index = 1;
        while(index < array.length){
            char temp = array[index];
            int j = index - 1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;

            index++;
        }

        return array;
    }

    static void findBigger(String word){
        char[] array = word.toCharArray();
        int lowerItemIndex = -1;
        int higherItemIndex = -1;

        for (int i = array.length-1; i > Math.max(0, lowerItemIndex); i--)
            for (int j = i - 1; j >= 0; j--)
                if (array[i] > array[j]){
                    if (lowerItemIndex < j){
                        lowerItemIndex = j;
                        higherItemIndex = i;
                    }
                    else if (lowerItemIndex == j){
                        if (array[higherItemIndex] > array[i])
                            higherItemIndex = i;
                    }

                    break;
                }

        if (lowerItemIndex == -1){
            System.out.println("no answer");
            return;
        }

        char temp = array[lowerItemIndex];
        array[lowerItemIndex] = array[higherItemIndex];
        array[higherItemIndex] = temp;

        String biggerWord = String.valueOf(array);
        char[] sortedPart = insertionSort(biggerWord.substring(lowerItemIndex+1).toCharArray());

        System.out.println(biggerWord.substring(0, lowerItemIndex+1) + String.valueOf(sortedPart));
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int numberOfWords = stdin.nextInt();

        for (int i = 0; i < numberOfWords; i++)
            findBigger(stdin.next());

        stdin.close();
    }
}
