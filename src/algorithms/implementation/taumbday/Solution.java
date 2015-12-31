package algorithms.implementation.taumbday;

import java.util.Scanner;

/**
 * Created by buyan on 30/12/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextByte();
        for (int i = 0; i < testCases; i++) {
            long blackGift = stdin.nextLong();
            long whiteGift = stdin.nextLong();
            long blackPrice = stdin.nextLong();
            long whitePrice = stdin.nextLong();
            long exchange = stdin.nextLong();

            long cost;
            if (Math.abs(blackPrice - whitePrice) > exchange)
                if (blackPrice > whitePrice)
                    cost = whitePrice * (whiteGift + blackGift) + blackGift * exchange;
                else
                    cost = blackPrice * (whiteGift + blackGift) + whiteGift * exchange;
            else
                cost = whitePrice * whiteGift + blackPrice * blackGift;
            System.out.println(cost);
        }
    }
}
