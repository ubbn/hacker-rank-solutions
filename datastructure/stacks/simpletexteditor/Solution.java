package datastructure.stacks.simpletexteditor;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by bbn on 3/30/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int totalOperations = stdin.nextInt();
        Stack<String> archive = new Stack<>();
        StringBuilder text = new StringBuilder();
        int k;

        while(totalOperations-->0){
            int operation = stdin.nextByte();
            if (operation == 1 || operation == 2)
                archive.push(text.toString());
            switch (operation){
                case 1:
                    String w = stdin.next();
                    text.append(w);
                    break;
                case 2:
                    k = stdin.nextInt();
                    if (k > 0 && k <= text.length())
                        text.replace(Math.max(text.length()-k,0), text.length(), "");
                    break;
                case 3:
                    k = stdin.nextInt();
                    if (k > 0 && k <= text.length())
                        System.out.println(text.charAt(k-1));
                    break;
                case 4:
                    text = new StringBuilder(archive.pop());
                default:
            }
        }

        stdin.close();
    }
}