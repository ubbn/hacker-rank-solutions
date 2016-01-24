package datastructure.trees.height;

/**
 * Created by buyan on 1/24/16.
 */

class Node {
    int data;
    Node left;
    Node right;
}

public class Solution {
    static int HEIGHT = 0;

    public static void traverse(Node node, int d){
        if (node.left == null && node.right == null)
        {
            if (d > HEIGHT)
                HEIGHT = d;
        }
        else{
            if (node.left != null)
                traverse(node.left, d+1);
            if (node.right != null)
                traverse(node.right, d+1);
        }
    }

    public static int getHeight(Node root){
        traverse(root, 1);
        return HEIGHT;
    }


}
