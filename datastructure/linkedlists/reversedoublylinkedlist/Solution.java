package datastructure.linkedlists.reversedoublylinkedlist;

import java.util.Scanner;

/**
 * Created by bbn on 2/12/16.
 */

class Node {
    int data;
    Node next;
    Node prev;
}

public class Solution {
    /*
      Print elements of a doubly linked list on console
      head pointer input could be NULL as well for empty list
    */
    void Print(Node head) {
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    /*
      Insert Node at the end of a doubly linked list
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
                newNode.prev = temp;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    /*
      Reverse the order of the nodes in the list.
      The head node might be NULL to indicate that the list is empty.
    */
    Node Reverse(Node head) {
        Node current = head;
        while(current != null){
            Node prev = current.prev;
            current.prev = current.next;
            current.next = prev;

            if (current.prev == null)
                return current;

            current = current.prev;
        }
        return current;
    }

    /*
      Recursive version of Reverse method
    */
    Node ReverseRecursively(Node head) {
        Node prev = head.prev;
        head.prev = head.next;
        head.next = prev;

        if (head.prev != null)
            return ReverseRecursively(head.prev);
        else
            return head;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int numberOfElements = stdin.nextInt();

        Node head = null;
        Solution linkedList = new Solution();
        for (int i = 0; i < numberOfElements; i++) {
            head = linkedList.Insert(head, stdin.nextInt());
        }

        // print before insert
        linkedList.Print(head);
        head = linkedList.Reverse(head);

        linkedList.Print(head);
        head = linkedList.ReverseRecursively(head);

        // print after insert
        linkedList.Print(head);
        
        stdin.close();
    }
}

