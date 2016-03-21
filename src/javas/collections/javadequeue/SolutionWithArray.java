package javas.collections.javadequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by buyan on 3/21/16.
 * This solution uses array with size of all possible unique elements, 10M
 * Although it passes time limit, didn't pass memory limit
 */
public class SolutionWithArray {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = stdin.nextInt();
        int m = stdin.nextInt();
        int maxLength = 0;
        int unique[] = new int[10000001];

        for (int i = 0; i < n; i++) {
            int num = stdin.nextInt();
            deque.add(num);
            if (unique[num] == 0){
                unique[num] = 1;
                if (deque.size() >= m){
                    maxLength = m;
                    break;
                }
            }
            else{
                if (maxLength < deque.size() - 1)
                    maxLength = deque.size() - 1;
                while(true){
                    int temp = deque.removeFirst();
                    if (temp == num)
                        break;
                    else
                        unique[temp] = 0;
                }
            }
        }
        System.out.println(maxLength);

        stdin.close();
    }
}