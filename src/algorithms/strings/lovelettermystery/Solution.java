package algorithms.strings.lovelettermystery;

import java.util.Scanner;

/**
 * Created by buyan on 1/21/16.
 */
public class Solution {

    private static int printOperation(String word){
        int operation = 0;
        int i = -1;
        while(++i < word.length()/2){
            operation += Math.abs(word.charAt(i) - word.charAt(word.length()-1-i));
        }

        return operation;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        stdin.nextLine();
        while(testCases-->0)
            System.out.println(printOperation(stdin.nextLine()));

        stdin.close();
    }
}