package algorithms.implementation.sherlockthebeast;

import java.util.Scanner;

/**
 * Created by bb on 12/26/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        for (int i = 0; i < testCases; i++) {
            int n = stdin.nextInt();

            int j = 0;
            int numberOf5 = n;
            while(numberOf5 >= 0 && numberOf5 % 3 != 0){
                j++;
                numberOf5 -= 5;
            }

            if (numberOf5 % 3 == 0){
                //if (numberOf5 > 0)
                System.out.print(new String(new char[numberOf5]).replace("\0", "5"));
                //if (n-numberOf5 > 0)
                System.out.print(new String(new char[n-numberOf5]).replace("\0", "3"));
//                for (int k = 0; k < numberOf5; k++)
//                    System.out.print(5);
//                for (int k = 0; k < n - numberOf5; k++)
//                    System.out.print(3);
            }
            else
                System.out.print(-1);
            System.out.println();
        }
    }

}
