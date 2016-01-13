package algorithms.strings.gemstones;

import java.util.*;

/**
 * Created by buyan on 1/13/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int stoneCount = stdin.nextInt();
        String stones[] = new String[stoneCount];

        stdin.nextLine();
        for (int i = 0; i < stoneCount; i++)
            stones[i] = stdin.nextLine();

        HashSet<Integer> uniqueChars = new HashSet<>();
        int gemCount = 0;
        outer:
        for (int i = 0; i < stones[0].length(); i++) {
            char element = stones[0].charAt(i);
            if (!uniqueChars.contains((int)element)){
                uniqueChars.add((int)element);
                for (int j = 1; j < stoneCount; j++)
                    if (stones[j].indexOf(element) == -1)
                        continue outer;
                gemCount++;
            }
        }

        System.out.println(gemCount);
        stdin.close();
    }
}
