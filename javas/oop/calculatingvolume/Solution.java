package javas.oop.calculatingvolume;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;


/**
 * Created by bbn on 3/2/16.
 */
class Volume {
    void display(Double volume){
        System.out.printf("%.3f\n", volume);
    }

    // Volume of cube
    double main(int a){
        return Math.pow(a, 3);
    }

    // Volume of cuboid
    double main(int l, int b, int h){
        return l * b * h;
    }

    // Volume of hemisphere
    double main(double r){
        return 2 * Math.PI * Math.pow(r, 3) / 3;
    }

    // Volume of cylinder
    double main(double r, double h){
        return Math.PI * Math.pow(r, 2) * h;
    }
}

class Calculate {
    static Volume output;
    Scanner stdin;

    Calculate(){
        stdin = new Scanner(System.in);
        output = new Volume();
    }

    int getINTVal() throws IOException{
        int value = stdin.nextInt();
        if (value <= 0)
            throw new NumberFormatException("All the values must be positive");

        return value;
    }

    double getDoubleVal() throws IOException{

        double value = stdin.nextDouble();
        if (value <= 0)
            throw new NumberFormatException("All the values must be positive");

        return value;
    }

    static Volume get_Vol(){
        return output;
    }

}

public class Solution
{
    public static void main(String[] args) {
        Do_Not_Terminate.forbidExit();
        try{
            Calculate cal=new Calculate();
            int T=cal.getINTVal();
            while(T-->0){
                double volume = 0.0d;
                int ch=cal.getINTVal();
                if(ch==1){

                    int a=cal.getINTVal();
                    volume=Calculate.get_Vol().main(a);


                }
                else if(ch==2){

                    int l=cal.getINTVal();
                    int b=cal.getINTVal();
                    int h=cal.getINTVal();
                    volume=Calculate.get_Vol().main(l,b,h);

                }
                else if(ch==3){

                    double r=cal.getDoubleVal();
                    volume=Calculate.get_Vol().main(r);

                }
                else if(ch==4){

                    double r=cal.getDoubleVal();
                    double h=cal.getDoubleVal();
                    volume=Calculate.get_Vol().main(r,h);

                }
                cal.output.display(volume);
            }

        }
        catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }


    }
}
/**
 *This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate

