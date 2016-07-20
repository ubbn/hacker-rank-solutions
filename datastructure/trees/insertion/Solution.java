package datastructure.trees.insertion;

/**
 * Created by buyan on 1/27/16.
 */

class Node {
    int data;
    Node left;
    Node right;
}

public class Solution {
    static Node Insert(Node root,int value){
        Node newNode = new Node();
        newNode.data = value;
        if (root == null)
            return newNode;

        Node tmp = root;
        while(true){
            if (tmp.data < value)
                if(tmp.right == null){
                    tmp.right = newNode;
                    return root;
                }
                else
                    tmp = tmp.right;
            else if (tmp.left == null){
                tmp.left = newNode;
                return root;
            }
            else
                tmp = tmp.left;
        }
    }
}
