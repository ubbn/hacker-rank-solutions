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

        int nextIndex = 0;
        int prevIndex = 0;
        while(nextIndex < 25){
            prevIndex = nextIndex;
            nextIndex = nextIndex(charCount, nextIndex);
            int difference = charCount[nextIndex] - charCount[nextIndex];
            if (difference == 1) {
                int nextIndex2 = nextIndex(charCount, nextIndex);
                if (nextIndex2 < 24 && charCount[nextIndex2] != 0 && charCount[nextIndex2] - charCount[nextIndex] != -1)
                    if (nextIndex > 0)
                        break;

            } else if (difference == -1) {
                if (nextIndex > 0 && charCount[nextIndex] - charCount[prevIndex] != 1)
                    if (charCount[i + 1] > 1)
                        break;

            } else if (Math.abs(difference) > 1)
                break;
        }

        if (nextIndex >= 25)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
