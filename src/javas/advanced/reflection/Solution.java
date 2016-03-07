package javas.advanced.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by bbn on 3/7/16.
 * Print all public methods' name in alphabetical order
 */
public class Solution {
    public static void printMethodNames(ArrayList<String> names){
        for (String name : names)
            System.out.println(name);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class student = Class.forName("javas.advanced.reflection.Solution");
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        printMethodNames(methodList);
    }
}
