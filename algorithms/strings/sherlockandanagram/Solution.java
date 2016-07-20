package algorithms.strings.sherlockandanagram;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by buyan on 1/18/16.
 */
public class Solution {
    static boolean isAnagram(String a, String b){
        char arrA[] = a.toCharArray();
        char arrB[] = b.toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);
        return Arrays.equals(arrA, arrB);
    }

    static void findUnorderedAnagrams(String str){
        int len = str.length();
        int anagrams = 0;

        for (int i = 1; i < len; i++)
            for (int j = 0; j+i < len; j++)
                for (int k = j+1; k+i<= len; k++)
                    if(isAnagram(str.substring(j, j+i), str.substring(k,k+i)))
                        anagrams++;

        System.out.println(anagrams);
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();
        while(testCases-->0)
            findUnorderedAnagrams(stdin.next());
    }
}
