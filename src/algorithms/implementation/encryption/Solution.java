package algorithms.implementation.encryption;

import java.util.Scanner;

/**
 * Created by buyan on 31/12/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String message = stdin.next();
        int length = message.length();
        int cols = (int)Math.ceil(Math.sqrt(length));

        for (int c = 0; c < cols; c++) {
            int startIndex = c;
            do {
                System.out.print(message.charAt(startIndex));
                startIndex += cols;
            } while(startIndex < length);
            System.out.print(" ");
        }
    }
}
