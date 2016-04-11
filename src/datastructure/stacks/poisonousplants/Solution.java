package datastructure.stacks.poisonousplants;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by buyan on 4/10/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Stack<Integer> decreased = new Stack<>();
        Stack<Integer> lastIndex = new Stack<>();

        int testCases = stdin.nextInt();
        if(testCases > 0){
            decreased.push(stdin.nextInt());
            lastIndex.push(0);
        }

        int currentDays = 0, maxDays = 0, left = decreased.peek();
        while(testCases-- > 1){
            int current = stdin.nextInt();
            if (left < current)
                currentDays = 1;
            else {
                int temp = decreased.peek();
                int localMax = currentDays;
                while (temp > current && !decreased.isEmpty()){
                    localMax = lastIndex.peek() > localMax ? lastIndex.peek() : localMax;
                    decreased.pop();
                    lastIndex.pop();
                    temp = decreased.isEmpty() ? 0 : decreased.peek();
                }
                if (decreased.isEmpty())
                    currentDays = 0;
                else if (temp == current)
                    currentDays = lastIndex.peek() == 0 ? 0 : lastIndex.peek() + 1;
                else
                    currentDays = localMax + 1;

                decreased.push(current);
                lastIndex.push(currentDays);
            }
            left = current;

            if (maxDays < currentDays)
                maxDays = currentDays;
        }
        System.out.println(maxDays);
        stdin.close();
    }
}