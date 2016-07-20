package datastructure.linkedlists.twolists;

/**
 * Created by buyan on 1/30/16.
 */

class Node {
    int data;
    Node next;
}

public class Solution {

  /*
    Compare two linked lists A and B
    Return 1 if they are identical and 0 if they are not. 
  */
  int CompareLists(Node headA, Node headB) {
      if (headA == null && headB == null)
          return 1;
      else if (headA == null || headB == null)
          return 0;
      else
          if (headA.data == headB.data)
              return CompareLists(headA.next, headB.next);
          else
              return 0;
  }
  
  /*
    Merge two linked lists 
    head pointer input could be NULL as well for empty list
  */
  
  Node MergeLists(Node headA, Node headB) {
      if (headA == null)
          return headB;
      
      if (headB == null)
          return headA;
  
      if (headA.data > headB.data){
          Node node = MergeLists(headA, headB.next);
          headB.next = node;
          return headB;
      }
      else{
          Node node = MergeLists(headA.next, headB);
          headA.next = node;
          return headA;
      }
  }  


}
