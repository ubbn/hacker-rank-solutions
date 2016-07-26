package javas.bignumber.bigdecimal;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by buyan on 3/6/16.
 */
public class Solution {

    static void insertionSort(String[] numbers){
        for (int i = 1; i < numbers.length; i++) {
            String pivot = numbers[i];
            int j = i - 1;
            while (j >= 0 && new BigDecimal(pivot).compareTo(new BigDecimal(numbers[j])) == 1){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = pivot;
        }
    }

    public static void main(String[] args) {
        //Input
        Scanner stdin= new Scanner(System.in);
        int n = stdin.nextInt();
        String []s = new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=stdin.next();
        }

        insertionSort(s);

        //Output
        for(int i=0; i<n;i ++)
        {
            System.out.println(s[i]);
        }

        stdin.close();
    }
}
