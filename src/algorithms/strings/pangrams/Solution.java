package algorithms.strings.pangrams;

import java.util.Scanner;

/**
 * Created by buyan on 1/9/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String alphabet = new String();

        String line = stdin.nextLine().toLowerCase();
        String words[] = line.split("\\s+");
        for(String word : words)
            for (int i = 0; i < word.length(); i++)
                if(alphabet.indexOf(word.charAt(i)) == -1)
                    alphabet += word.charAt(i);

        if (alphabet.length() == 26)
            System.out.printf("pangram");
        else
            System.out.println("not pangram");

        stdin.close();
    }
}
