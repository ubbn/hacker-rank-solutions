package algorithms.warmup.timeconversion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by bb on 12/25/15.
 */
public class Solution {
    public static void main(String[] args) throws  Exception{
        Scanner stdin = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ssa");
        Date time = format.parse(stdin.next());

        System.out.println(new SimpleDateFormat("HH:mm:ss").format(time));
        stdin.close();
    }

}
