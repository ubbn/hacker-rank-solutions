package datastructure.stacks.largestrectangle;

import java.util.*;

/**
 * Created by buyan on 4/3/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int height[] = new int[n];

        for (int i = 0; i < n; i++)
            height[i] = stdin.nextInt();

        findMaxRectangle(height);

        stdin.close();
    }

    static void updateHeights(Map<Integer, Integer> heights, List<Integer> sortedHeights, int newHeight){
        if (!heights.containsKey(newHeight))
            heights.put(newHeight, 1);

        for (int height : sortedHeights){
            if (height <= newHeight){
                heights.put(height, heights.get(height)+1);
            }
        }
    }

    static void addHeight(List<Integer> sortedHeights, int value){
        if (sortedHeights.contains(value))
            return;

        int i = sortedHeights.size() - 1;
        while(i >= 0 && sortedHeights.get(i) > value)
            --i;

        sortedHeights.add(i+1, value);
    }

    static void findMaxRectangle(int[] height) {
        Stack<Integer> current = new Stack<>();
        Map<Integer, Integer> heights = new HashMap<>();
        List<Integer> sortedHeights = new ArrayList<>();

        for (int i = 0; i < height.length; i++) {
            if (current.isEmpty()){
                current.add(height[i]);
                addHeight(sortedHeights, height[i]);
                updateHeights(heights, sortedHeights, height[i]);
            }
            else {
                int k = current.peek();
                if (k == height[i])
                    updateHeights(heights, sortedHeights, height[i]);
                else if (k > height[i]){
                    if (heights.containsKey(height[i]))
                        heights.put(height[i], heights.get(height[i]) + 1);
                    else
                        heights.put(height[i], heights.get(height[i]) + 1);
                    // TODO

                }
                else {
                    current.add(height[i]);
                    addHeight(sortedHeights, height[i]);
                    updateHeights(heights, sortedHeights, height[i]);
                }
            }
        }
    }
}
