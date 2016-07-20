package algorithms.strings.sherlockandvalidstring;

import java.util.Scanner;

/**
 * Created by buyan on 2/15/16.
 */
public class Solution {

    static int nextIndex(int arr[], int i){
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j] > 0)
                return j;
        }
        return arr.length;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String word = stdin.next();
        int charCount[] = new int[26];

        for(char c : word.toCharArray()){
            charCount[c-97]++;
        }

        int index = 0;
        int nextIndex = 0;
        Boolean isOddFound = false;
        while(index < 25){
            nextIndex = nextIndex(charCount, index);
            if (nextIndex == 26)
                break;

            int difference = charCount[nextIndex] - charCount[index];
            int nextNextIndex = nextIndex(charCount, nextIndex);
            if (difference == 1) {
                if (isOddFound)
                    break;

                if (nextNextIndex < 26) {
                    if (charCount[nextNextIndex] - charCount[nextIndex] == 0) {
                        if (charCount[index] != 1)
                            break;
                    }
                    else if (charCount[nextNextIndex] - charCount[nextIndex] != -1)
                        break;
                }

                isOddFound = true;
            }
            else if (difference == -1) {
                if (isOddFound)
                    break;

                if (nextNextIndex == 26){
                    if (charCount[nextIndex] != 1)
                        break;
                }
                else{
                    if (charCount[nextNextIndex] - charCount[nextIndex] == 1) {
                        if (charCount[nextIndex] != 1)
                            break;
                    }
                    else if (charCount[nextNextIndex] - charCount[nextIndex] == 0){
                        if (index > 0)
                            break;
                    }
                    else
                        break;
                }

                isOddFound = true;
            }
            else if (Math.abs(difference) > 1) {
                if (isOddFound)
                    break;

                if (difference > 0){
                    if (index == 0) {
                        if (charCount[index] != 1)
                            break;
                    } else
                        break;
                } else{
                    if (nextNextIndex == 26){
                        if (charCount[nextIndex] != 1)
                            break;
                    } else {
                        if (charCount[nextIndex] == 1)
                            if (charCount[nextNextIndex] - charCount[nextIndex] != -difference)
                                break;
                    }
                }

                isOddFound = true;
            }

            index = nextIndex;
        }

        if (index >= 25 || nextIndex == 26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
