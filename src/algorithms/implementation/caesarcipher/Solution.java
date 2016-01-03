package algorithms.implementation.caesarcipher;

import java.util.Scanner;

/**
 * Created by buyan on 30/12/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int length = stdin.nextInt();
        String message = stdin.next();
        int shift = stdin.nextInt();
        for (int i = 0; i < length; i++) {
            int ascii = (int)message.charAt(i);
            int base = 0;
            // Capital letters
            if (ascii > 64 && ascii < 91)
                base = 65;
            // lower letters
            else if (ascii > 96 && ascii < 123)
                base = 97;

            if (base > 0)
                System.out.print((char)((ascii-base+shift)%26+base));
            else
                System.out.print((char)ascii);
        }
        stdin.close();
    }
}
