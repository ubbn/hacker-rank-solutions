package datastructure.stacks.poisonousplants;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by buyan on 4/10/16.
 */
public class Solution {
    static void findDays(int[] plants){
        Stack<Integer> current = new Stack<>();
        Stack<Integer> lastIndex = new Stack<>();
        if(plants.length > 0){
            current.push(plants[0]);
            lastIndex.push(0);
        }

        int days = 0;
        int maxDays = 0;
        int k = current.peek();
        for (int i = 1; i < plants.length; i++) {
            if (k < plants[i])
                days = 1;
            else {
                int temp = current.peek();
                while (temp > plants[i] && !current.isEmpty()){
                    current.pop();
                    lastIndex.pop();
                    temp = current.isEmpty() ? 0 : current.peek();
                }
                if (current.isEmpty())
                    days = 0;
                else if (current.peek() == plants[i])
                    days = lastIndex.peek() == 0 ? 0 : lastIndex.peek() + 1;
                else
                    days++;

                current.push(plants[i]);
                lastIndex.push(days);
            }
            k = plants[i];

            if (maxDays < days)
                maxDays = days;
        }

        System.out.println(maxDays);
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();
        int[] plants = new int[testCases];


        for (int i = 0; i < testCases; i++)
            plants[i] = stdin.nextInt();

        findDays(plants);
        stdin.close();
    }
}