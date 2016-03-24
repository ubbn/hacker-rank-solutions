package javas.collections.javahashset;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by buyan on 3/24/16.
 */

class Pair {
    String a;
    String b;

    Pair(String a, String b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!obj.getClass().equals(Pair.class)) {
            return false;
        }
        return a.equals(((Pair) obj).a) && b.equals(((Pair) obj).b);
    }

    @Override
    public int hashCode() {
        return a.hashCode() * 23 + b.hashCode();
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int pairCount = stdin.nextInt();
        HashSet<Pair> set = new HashSet<>();

        while (pairCount-->0){
            String a = stdin.next();
            String b = stdin.next();
            set.add(new Pair(a, b));

            System.out.println(set.size());
        }

        stdin.close();
    }
}