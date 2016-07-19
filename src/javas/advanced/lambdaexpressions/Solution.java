import java.io.*;
import java.util.*;

interface performOperation{
    int check(int a);
}

class Math{
   public static int checker(performOperation p ,int num){
       return p.check(num);
   }
   public performOperation checkEvenOdd(){
       return number-> number%2;
   }

   public performOperation checkPrime(){
       return number ->{
               if (number == 2)
                   return 0;
               
               if (number%2==0)
                   return 1;
               
               for (int i=3;i<number/2;i+=2)
                   if (number%i==0)
                       return 1;
                   
               return 0;
           };
   }

   public performOperation checkPalindrome(){
       return number -> {
               String str = String.valueOf(number);
               int length = str.length();
               for(int i=0;i<length/2;i++){
                    if (str.charAt(i) != str.charAt(length-1-i))
                        return 1;
               }
                   
               return 0;
           };
   }
}

public class Solution {

    public static void main(String[] args)throws IOException {
        Math ob = new Math();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        performOperation op;
        int ret =0;
        String ans=null;
        while(T-->0){
            String s=br.readLine().trim();
            StringTokenizer st=new StringTokenizer(s);
            int ch=Integer.parseInt(st.nextToken());
            int num=Integer.parseInt(st.nextToken());
            if(ch==1){
                op = ob.checkEvenOdd();  
                ret = ob.checker(op,num);
                ans = (ret == 0)?"EVEN":"ODD";
            }
            else if(ch==2){
                op = ob.checkPrime();
                ret = ob.checker(op,num);
                ans = (ret == 0)?"PRIME":"COMPOSITE";
            }
            else if(ch==3){
                op = ob.checkPalindrome();
                ret = ob.checker(op,num);
              	ans = (ret == 0)?"PALINDROME":"NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
