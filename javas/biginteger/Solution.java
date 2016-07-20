package javas.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by buyan on 3/6/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        BigInteger bigIntOne = new BigInteger(stdin.next());
        BigInteger bigIntTwo = new BigInteger(stdin.next());

        System.out.println(bigIntOne.add(bigIntTwo));
        System.out.println(bigIntOne.multiply(bigIntTwo));

        stdin.close();
    }
}
