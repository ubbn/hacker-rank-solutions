package algorithms.strings.funnystring;

import java.util.Scanner;

/**
 * Created by buyan on 1/10/16.
 */
public class Solution {
    public static void checkIfFunny(String str){
        int length = str.length();
        for (int i = 1; i < length; i++)
            if (Math.abs(str.charAt(i)-str.charAt(i-1)) != Math.abs(str.charAt(length-1-i)-str.charAt(length-i))){
                System.out.println("Not Funny");
                return;
            }
        System.out.println("Funny");
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        for (int i = 0; i < testCases; i++)
            checkIfFunny(stdin.next());
    }
}
