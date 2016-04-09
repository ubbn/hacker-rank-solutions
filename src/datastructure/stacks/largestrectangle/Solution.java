package datastructure.stacks.largestrectangle;

import java.util.*;

/**
 * Created by buyan on 4/3/16.
 * Updated by buyan on 4/9/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int height[] = new int[n];

        for (int i = 0; i < n; i++)
            height[i] = stdin.nextInt();

        System.out.println(findMaxRectangle(height));
        stdin.close();
    }

    static void storeCountOfHeight(Map<Integer, Integer> heights, int height, int count){
        if (heights.containsKey(height))
            count += heights.get(height);

        heights.put(height, count);
    }

    static int findMaxRectangle(int[] height) {
        Stack<Integer> current = new Stack<>();
        Map<Integer, Integer> heights = new HashMap<>();
        int maxRectangle = 0;

        if (height.length > 0){
            current.push(height[0]);
            storeCountOfHeight(heights, height[0], 1);
        }

        for (int i = 1; i < height.length; i++) {
            int k = current.peek();
            if (k > height[i]){
                int count = 0;
                while (!current.isEmpty() && k > height[i]) {
                    current.pop();
                    count = heights.get(k);
                    if (count * k > maxRectangle)
                        maxRectangle = count * k;
                    heights.put(k, 0);
                    k = current.isEmpty() ? 0 : current.peek();
                }
                if (k < height[i]){
                    current.push(height[i]);
                    storeCountOfHeight(heights, height[i], count);
                }
            }
            else if (k < height[i])
                current.push(height[i]);

            for(Integer uniqueHeight : current)
                storeCountOfHeight(heights, uniqueHeight, 1);
        }

        for(Integer uniqueHeight : heights.keySet()) {
            int temp = heights.get(uniqueHeight) * uniqueHeight;
            if (temp > maxRectangle)
                maxRectangle = temp;
        }

        return maxRectangle;
    }
}
