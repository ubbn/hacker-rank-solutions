package datastructure.stacks.maximumelement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by buyan on 4/2/16.
 */
public class SolutionWithMap {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();
        int i = 1;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);

        while(testCases-- > 0){
            int query = stdin.nextInt();
            switch (query) {
                case 1:
                    int k = stdin.nextInt();
                    map.put(i, Math.max(map.get(i-1), k));
                    ++i;
                    break;
                case 2:
                    map.remove(--i);
                    break;
                case 3:
                    System.out.println(map.get(i-1));
            }
        }

        stdin.close();
    }
}
