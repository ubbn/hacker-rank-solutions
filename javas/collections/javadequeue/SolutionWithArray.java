package javas.collections.javadequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by buyan on 3/21/16.
 * Updated by buyan on 3/26/16
 *
 * This solution uses array with size of all possible unique elements, 10M
 */
public class SolutionWithArray {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = stdin.nextInt();
        int m = stdin.nextInt();
        int maxLength = 0, current = 0;
        Integer temp;
        int unique[] = new int[10000001];

        for (int i = 0; i < n; i++) {
            int num = stdin.nextInt();
            deque.addLast(num);

            if (i >= m){
                temp = deque.removeFirst();
                if (unique[temp] > 1)
                    --unique[temp];
                else{
                    unique[temp] = 0;
                    --current;
                }
            }

            if (unique[num] == 0)
                current++;
            ++unique[num];

            if (maxLength < current)
                maxLength = current;
        }
        System.out.println(maxLength);

        stdin.close();
    }
}