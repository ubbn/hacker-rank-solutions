package algorithms.strings.anagram;

import java.util.Scanner;

/**
 * Created by buyan on 1/15/16.
 */
public class Solution {
    static void processWord(String word){
        if (word.length() % 2 == 0){
            int letters[] = new int[26];
            for (int i = 0; i < word.length(); i++)
                if (i < word.length()/2)
                    letters[word.charAt(i)-97]++;
                else
                    letters[word.charAt(i)-97]--;

            int replacement = 0;
            for (int i = 0; i < 26; i++)
                replacement += Math.abs(letters[i]);

            System.out.println(replacement/2);
        }
        else
            System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();
        for (int i = 0; i < testCases; i++)
            processWord(stdin.next());
    }
}
