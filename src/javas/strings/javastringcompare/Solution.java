package javas.strings.javastringcompare;

import java.util.Scanner;

/**
 * Created by bbn on 2/28/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String word = stdin.next();
        int subStrlength = stdin.nextInt();

        int maxCharIndex=0;
        int minCharIndex=0;
        for (int i = 1; i <= word.length()-subStrlength; i++) {
            if (word.substring(maxCharIndex,maxCharIndex+subStrlength).compareTo(word.substring(i,i+subStrlength)) < 0)
                maxCharIndex = i;

            if (word.substring(minCharIndex,minCharIndex+subStrlength).compareTo(word.substring(i,i+subStrlength)) > 0)
                minCharIndex = i;
        }

        System.out.println(word.substring(minCharIndex, minCharIndex+subStrlength));
        System.out.println(word.substring(maxCharIndex, maxCharIndex+subStrlength));

        stdin.close();
    }
}
