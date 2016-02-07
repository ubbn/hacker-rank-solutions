package datastructure.linkedlists.getnodevalue;

import java.util.Scanner;

/**
 * Created by buyan on 2/7/16.
 */

class Node {
    int data;
    Node next;
}

public class SolutionWithStack {
  /*
    Get Nth element from the end in a linked list of integers
    Number of elements in the list will always be greater than N.
  */
      
  int GetNode(Node head,int n) {
    Stack<Integer> stack = new Stack<>();
    
    while(head != null){
      stack.push(head.data);
      head = head.next;
    }
    
    int data = 0;
    for(int i = 0; i <= n; i++){
      data = stack.pop();
    }

    return data;
  }

}
