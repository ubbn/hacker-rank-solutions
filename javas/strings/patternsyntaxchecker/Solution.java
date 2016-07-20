package javas.strings.patternsyntaxchecker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by bbn on 2/29/16.
 */
public class Solution {
    static void checkPatternValidity(String pattern){
        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        }
        catch (PatternSyntaxException e){
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int numberOfPatterns = Integer.parseInt(stdin.nextLine());

        while(numberOfPatterns-->0)
            checkPatternValidity(stdin.nextLine());

        stdin.close();
    }
}
