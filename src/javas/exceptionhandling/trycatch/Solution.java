package javas.exceptionhandling.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by bbn on 3/5/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        try {
            int numberOne = stdin.nextInt();
            int numberTwo = stdin.nextInt();

            System.out.println(numberOne / numberTwo);
        }
        catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch (Exception e){
            System.out.println(e);
        }

        stdin.close();
    }
}
