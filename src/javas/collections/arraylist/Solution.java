package javas.collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by buyan on 3/16/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int lines = stdin.nextInt();

        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            ArrayList<Integer> line = new ArrayList<>();
            int elements = stdin.nextInt();
            for (int j = 0; j < elements; j++) {
                line.add(stdin.nextInt());
            }
            numbers.add(line);
            stdin.nextLine();
        }

        int testCases = stdin.nextInt();
        for (int i = 0; i < testCases; i++) {
            int lineNumber = stdin.nextInt();
            if (lineNumber <= numbers.size()){
                int columnNumber = stdin.nextInt();
                if (columnNumber <= numbers.get(lineNumber-1).size()){
                    System.out.println(numbers.get(lineNumber-1).get(columnNumber-1));
                    continue;
                }
            }
            System.out.println("ERROR!");
        }

        stdin.close();
    }
}