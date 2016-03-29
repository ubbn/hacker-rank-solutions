package datastructure.stacks.balancedparenthesis;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by bbn on 3/29/16.
 */
public class Solution {
    static char getPair(char c){
        switch (c){
            case ')':
                return '(';
            case ']':
                return '[';
            case '}':
                return '{';
            default:
                return '\0';
        }
    }

    static boolean isBalanced(String batch){
        if (batch.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();
        for (char c : batch.toCharArray()){
            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty())
                    return false;
                else if (stack.pop() != getPair(c))
                    return false;
            }
            else if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();
        while(testCases-->0){
            System.out.println(isBalanced(stdin.next()) ? "YES" : "NO");
        }

        stdin.close();
    }
}