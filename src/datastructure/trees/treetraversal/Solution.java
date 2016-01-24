package datastructure.trees.treetraversal;

/**
 * Created by buyan on 1/23/16.
 */

class Node {
    int data;
    Node left;
    Node right;
}
public class Solution {

    void Preorder(Node root) {
        System.out.print(root.data + " ");
        if (root.left != null)
            Preorder(root.left);
        if (root.right != null)
            Preorder(root.right);
    }

    void Postorder(Node root) {
        if (root.left != null)
            Postorder(root.left);
        if (root.right != null)
            Postorder(root.right);
        System.out.print(root.data + " ");
    }

    void Inorder(Node root) {
        if (root.left != null)
            Inorder(root.left);
        System.out.print(root.data + " ");
        if (root.right != null)
            Inorder(root.right);
    }

}
