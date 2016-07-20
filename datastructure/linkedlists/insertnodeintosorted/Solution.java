package datastructure.linkedlists.insertnodeintosorted;

import java.util.Scanner;

/**
 * Created by buyan on 1/30/16.
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
      Insert Node at the end of a linked list
      head pointer input could be NULL as well for empty list
    */
    Node SortedInsert(Node head,int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null)
            return newNode;

        Node point = head;
        while(point != null){
            if (point.data >= data){
                Node tmp = point.prev;
                newNode.prev = tmp;
                newNode.next = point;
                if (tmp == null)
                    return newNode;
                else{
                    tmp.next = newNode;
                    point.prev = newNode;
                    return head;
                }

            }
            else if (point.next == null){
                point.next = newNode;
                newNode.prev = point;
                return head;
            }

            point = point.next;
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

        // print before insert
        linkedList.Print(head);

        head = linkedList.SortedInsert(head, 5);

        // print after insert
        linkedList.Print(head);
    }
}

