package javas.strings.javastringreverse;

import java.util.Scanner;

/**
 * Created by bbn on 2/28/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String word = stdin.next();

        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)){
                System.out.println("No");
                return;
            }

        }
        System.out.println("Yes");

        stdin.close();
    }
}
