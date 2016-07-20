package javas.collections.javastack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by bbn on 3/20/16.
 */
public class Solution {
    static boolean isBalanced(String batch){
        if (batch.length() % 2 != 0)
            return false;

        Stack stack = new Stack();
        for (char c : batch.toCharArray()){
            if (c == ')' || c == ']' || c == '}')
                if (stack.isEmpty())
                    return false;
                else
                    stack.pop();
            else if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        while(stdin.hasNext()){
            System.out.println(isBalanced(stdin.next()));
        }

        stdin.close();
    }
}