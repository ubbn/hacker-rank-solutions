package datastructure.linkedlists.findmergepoint;

/**
 * Created by buyan on 2/4/16.
 */

class Node {
    int data;
    Node next;
}

public class Solution {
  /*
    Insert Node at the end of a linked list 
    head pointer input could be NULL as well for empty list
    
    Idea: Iterate one of the lis till end and continue it from another
    list's start. Do it for another list until their iterated pointers
    are found to be same
  */
  int FindMergeNode(Node headA, Node headB) {
    Node tmpA = headA;
    Node tmpB = headB;
    
    while(tmpA != tmpB){
        tmpA = tmpA.next == null ? headB : tmpA.next;
        tmpB = tmpB.next == null ? headA : tmpB.next;
    }
    return tmpA.data;
  }

}
