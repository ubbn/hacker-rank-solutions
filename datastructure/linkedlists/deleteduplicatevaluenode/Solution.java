package datastructure.linkedlists.deleteduplicatevaluenode;

import java.util.Scanner;

/**
 * Created by buyan on 2/8/16.
 */

class Node {
    int data;
    Node next;
}

public class Solution {

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
      Print elements of a linked list on console
      head pointer input could be NULL as well for empty list
    */
    void Print(Node head) {
        while(head != null){
            System.out.print(head.data);
            head = head.next;
        }
        System.out.println();
    }

    /*
    * Remove duplicate elements from sorted linked list
    */
    Node RemoveDuplicates(Node head) {
        if (head == null || head.next == null)
            return head;

        Node current = head;
        while(current != null){
            Node tmp = current;
            // Go further until next different element found
            while (tmp.next != null && tmp.data == tmp.next.data)
                tmp = tmp.next;

            current.next = tmp.next;
            current = current.next;
        }

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

        head = linkedList.RemoveDuplicates(head);
        linkedList.Print(head);

        stdin.close();
    }
}