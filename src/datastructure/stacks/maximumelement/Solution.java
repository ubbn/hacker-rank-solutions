package datastructure.stacks.maximumelement;

import java.util.*;

/**
 * Created by buyan on 4/1/16.
 */
public class Solution {
    static int insert(List<Integer> sortedList, int number){
        int i = sortedList.size() - 1;
        while(i >= 0 && sortedList.get(i) > number){
            --i;
        }
        sortedList.add(i+1, number);
        return i+1;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        List<Integer> sortedList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int index;

        while(testCases-- > 0){
            int query = stdin.nextInt();
            switch (query) {
                case 1:
                    // insert at the top
                    index = insert(sortedList, stdin.nextInt());
                    stack.add(index);
                    break;
                case 2:
                    // remove the top
                    if (stack.isEmpty())
                        break;

                    index = stack.pop();
                    sortedList.remove(index);
                    break;
                case 3:
                    // print maximum element
                    if (!sortedList.isEmpty())
                        System.out.println(sortedList.get(sortedList.size()-1));
                    break;
                default:
            }
        }

        stdin.close();
    }
}