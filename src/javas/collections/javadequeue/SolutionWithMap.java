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
        Map<Integer, Integer> storage = new Hashtable<>();
        int maxLength = 0;
        Integer count;

        for (int i = 0; i < n; i++) {
            int num = stdin.nextInt();
            deque.addLast(num);

            if (i >= m){
                int first = deque.pollFirst();
                count = storage.get(first);
                if (count == null)
                    storage.put(num, 1);
                else if (count > 1)
                    storage.put(first, count-1);
                else
                    storage.remove(first);
            }

            count = storage.get(num);
            if (count == null)
                storage.put(num, 1);
            else
                storage.put(num, count+1);

            if (storage.size() > maxLength)
                maxLength = storage.size();
        }

        System.out.println(maxLength);
        stdin.close();
    }
}
