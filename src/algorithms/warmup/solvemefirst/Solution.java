package algorithms.warmup.solvemefirst;

/**
 * Created by buyan on 12/24/15.
 */
import java.util.*;

public class Solution {

    static int solveMeFirst(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
        in.close();
    }
}