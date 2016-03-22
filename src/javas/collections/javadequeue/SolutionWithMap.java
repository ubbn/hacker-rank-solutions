package javas.collections.javadequeue;

import java.util.*;

/**
 * Created by buyan on 3/22/16.
 */
public class SolutionWithMap {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = stdin.nextInt();
        int m = stdin.nextInt();
        int maxLength = 0;
        int count = 0;
        Map<Integer, Integer> storage = new Hashtable<>();
        int startIndex = 0;

        for (int i = 0; i < n; i++) {
            int num = stdin.nextInt();
            Integer tmp = storage.get(num);
            if (tmp != null && tmp > startIndex){
                startIndex = tmp + 1;
                count = i - startIndex;
            }
            count++;
            storage.put(num, i);

            if (count > maxLength)
                maxLength = count;

            if (maxLength >= m)
                break;
        }
        System.out.println(maxLength);

        stdin.close();
    }
}
