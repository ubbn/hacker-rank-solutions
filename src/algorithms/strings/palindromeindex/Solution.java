package algorithms.strings.palindromeindex;

import java.util.Scanner;

/**
 * Created by buyan on 1/19/16.
 */
public class Solution {

    private static boolean isPalindrome(String word){
        int i = 0;
        do {
            if (word.charAt(i) != word.charAt(word.length()-1-i))
                return false;
        } while(++i < word.length()/2);

        return true;
    }

    private static int getPalindromeIndex(String word) {
        int len = word.length();
        int i = 0;
        while (word.charAt(i) == word.charAt(len-1-i) && i < len/2) {
            i++;
        }
        if (i < len/2){
            if (isPalindrome(word.substring(i, len-1-i)))
                return len - 1 - i;
            if (isPalindrome(word.substring(i+1, len-i)))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        while(testCases-->0)
            System.out.println(getPalindromeIndex(stdin.next()));
    }
}