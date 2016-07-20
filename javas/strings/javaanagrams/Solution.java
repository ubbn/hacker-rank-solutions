package javas.strings.javaanagrams;

import java.util.Scanner;

/**
 * Created by bbn on 2/28/16.
 */
public class Solution {

    static boolean isAnagram(String A, String B) {
        if (A.length() != B.length())
            return false;

        int[] lettersCount = new int[26];
        for (int i = 0; i < A.length(); i++) {
            lettersCount[A.charAt(i)-97]++;
            lettersCount[B.charAt(i)-97]--;
        }

        for (int i = 0; i < 26; i++) {
            if (lettersCount[i] != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String wordOne = stdin.next().toLowerCase();
        String wordTwo = stdin.next().toLowerCase();

        boolean result = isAnagram(wordOne, wordTwo);
        if (result)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

        stdin.close();
    }
}
