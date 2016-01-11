package algorithms.strings.alternatingcharacters;

import java.util.Scanner;

/**
 * Created by buyan on 1/11/16.
 */
public class Solution {
    public static int findMinDeletion(String word){
        if (word.length() == 0)
            return 0;

        char letter = word.charAt(0);
        int deletion = 0;
        for (int i = 1; i < word.length(); i++) {
            if (letter == word.charAt(i))
                deletion++;
            else
                letter = word.charAt(i);
        }
        return deletion;
    }


    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        for (int i = 0; i < testCases; i++)
            System.out.println(findMinDeletion(stdin.next()));
    }
}
