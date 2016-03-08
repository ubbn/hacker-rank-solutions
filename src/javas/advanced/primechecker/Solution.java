package javas.advanced.primechecker;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.*;

/**
 * Created by bbn on 3/8/16.
 */
class Prime{
    void checkPrime(int... numbers){
        for(int number : numbers){
            if (isPrime(number))
                System.out.print(number + " ");
        }

        System.out.println();
    }

    boolean isPrime(int number){
        if (number == 2)
            return true;
        else if (number == 1 || number % 2 == 0)
            return false;

        int div = 3;
        while(div <= Math.sqrt(number)){
            if (number % div == 0)
                return false;
            div += 2;
        }

        return true;
    }

}

public class Solution {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
