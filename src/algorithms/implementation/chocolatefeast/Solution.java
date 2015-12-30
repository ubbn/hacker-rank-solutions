package algorithms.implementation.chocolatefeast;

import java.util.Scanner;

/**
 * Created by bb on 12/30/15.
 */
public class Solution {
    static int price, wrappersFor1Choc;

    static int calculateChocolates(int wrappers){
        if (wrappers < wrappersFor1Choc)
            return 0;
        return wrappers / wrappersFor1Choc + calculateChocolates(wrappers / wrappersFor1Choc + wrappers % wrappersFor1Choc);
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        for (int i = 0; i < testCases; i++) {
            int money = stdin.nextInt();
            price = stdin.nextInt();
            wrappersFor1Choc = stdin.nextInt();

            System.out.println(money / price + calculateChocolates(money / price));
        }
    }
}
