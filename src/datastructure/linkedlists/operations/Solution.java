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


    /*
      Insert Node at a given position in a linked list
      head can be NULL
      First element in the linked list is at position 0
    */
    Node InsertNth(Node head, int data, int position) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null || position == 0){
            newNode.next = head;
            return newNode;
        }

        Node node = head;
        while(position-->1){
            node = node.next;
        }

        Node tmp = node.next;
        node.next = newNode;
        newNode.next = tmp;

        return head;
    }

    /*
      Delete the node at the given position and return the head node
      A position of 0 indicates head, a position of 1 indicates one node away
      from the head and so on. The list may become empty after you delete the node.
    */
    Node Delete(Node head, int position) {
        if (head == null)
            return null;

        if (position == 0)
            return head.next;

        Node node = head;
        while(position-->1){
            node = node.next;
        }

        if (node.next != null)
            node.next = node.next.next;

        return head;
    }

    /*
      Insert Node at the end of a linked list
      head pointer input could be NULL as well for empty list
    */

    void ReversePrint(Node head) {
        if (head == null)
            return;

        ReversePrint(head.next);
        System.out.println(head.data);
    }



}
