package algorithms.strings.gameofthronesi;

import java.util.Scanner;

/**
 * Created by buyan on 1/12/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String inputString = stdin.nextLine();
        int alphabet[] = new int[26];

        String ans = "YES";
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        for (int i = 0; i < inputString.length(); i++)
            alphabet[inputString.charAt(i) - 97] ++;

        int oddCount = 0;
        for (int i = 0; i < 26; i++)
            if (alphabet[i] % 2 == 1)
                if (oddCount == 0)
                    oddCount++;
                else {
                    ans = "NO";
                    break;
                }

        System.out.println(ans);
        stdin.close();
    }
}
