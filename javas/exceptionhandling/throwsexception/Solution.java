package javas.exceptionhandling.throwsexception;

import java.util.Scanner;

/**
 * Created by bbn on 3/5/16.
 */

class myCalculator {

    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");

        return (int)Math.pow(n, p);
    }

}

public class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

        in.close();
    }
}
