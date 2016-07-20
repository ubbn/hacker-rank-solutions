package algorithms.strings.twostrings;

import java.util.Scanner;

/**
 * Created by buyan on 1/16/16.
 */
public class Solution {
    static void checkIfCommon(String a, String b) {
        String longer = a;
        String shorter = b;
        if (longer.length() < shorter.length()){
            shorter = a;
            longer = b;
        }

        int visitedChars[] = new int[26];
        for (int i = 0; i < shorter.length(); i++) {
            if (visitedChars[shorter.charAt(i)-97] > 0)
                continue;
            else
                visitedChars[shorter.charAt(i)-97] = 1;

            if (longer.indexOf(shorter.charAt(i)) != -1) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();
        while(testCases-->0)
            checkIfCommon(stdin.next(), stdin.next());
    }
}
