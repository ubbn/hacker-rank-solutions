package javas.strings.javastringtoken;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by bbn on 2/29/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String sentence = stdin.nextLine();
        String delims = "!,?._'@ ";

        StringTokenizer st = new StringTokenizer(sentence, delims);
        System.out.println(st.countTokens());
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        stdin.close();
    }
}
