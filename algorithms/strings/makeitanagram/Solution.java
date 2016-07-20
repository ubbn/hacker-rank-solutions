package algorithms.strings.makeitanagram;

import java.util.Scanner;

/**
 * Created by buyan on 1/14/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String wordOne = stdin.nextLine();
        String wordTwo = stdin.nextLine();

        int lettersOne[] = new int[26];
        int lettersTwo[] = new int[26];

        int deletion = 0;
        for (int i = 0; i < wordOne.length(); i++)
            if (wordTwo.indexOf(wordOne.charAt(i)) != -1)
                lettersOne[wordOne.charAt(i)-97]++;
            else
                deletion++;

        for (int i = 0; i < wordTwo.length(); i++)
            if (lettersOne[wordTwo.charAt(i)-97] > 0)
                lettersTwo[wordTwo.charAt(i)-97]++;
            else
                deletion++;

        for (int i = 0; i < 26; i++)
            deletion += Math.abs(lettersOne[i]-lettersTwo[i]);

        System.out.println(deletion);
    }
}
