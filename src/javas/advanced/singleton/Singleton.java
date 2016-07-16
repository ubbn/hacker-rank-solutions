import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

/**
 * Created by buyan on 7/16/16.
 */
class Singleton{
    public String str;
    private static Singleton instance;
    
    private Singleton(){}
    
    /*
     Thread-safe and with double-checked locking
    */
    public static Singleton getSingleInstance(){
        if (instance == null){
            synchronized(Singleton.class){
                if (instance == null)
                    instance = new Singleton();
            }
        }
        
        return instance;
    }
}
