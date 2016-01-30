package datastructure.linkedlists.operations;

/**
 * Created by buyan on 1/30/16.
 */

class Node {
    int data;
    Node next;
}

public class Solution {
    /*
      Print elements of a linked list on console
      head pointer input could be NULL as well for empty list
    */
    void Print(Node head) {
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    /*
      Insert Node at the end of a linked list
      head pointer input could be NULL as well for empty list
    */
    Node Insert(Node head,int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null)
            return newNode;

        Node temp = head;
        while(true){
            if (temp.next == null){
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }


    /*
      Insert Node at the beginning of a linked list
      head pointer input could be NULL as well for empty list
    */
    Node InsertAtHead(Node head,int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = head;
        return newNode;
    }

}
