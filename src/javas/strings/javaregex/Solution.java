package javas.strings.javaregex;

import java.util.*;

/**
 * Created by bbn on 3/1/16.
 */

public class Solution{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
    }

}

/*
* Regex string for IPV4
 */
class myRegex {
    String pattern = "\\A((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\z";
}