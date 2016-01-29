package datastructure.trees.lowestcommonancestor;

/**
 * Created by buyan on 1/29/16.
 */

class Node{
    public  int data;
    public  Node left, right;
}

public class Solution {

    static Node lca(Node root,int v1,int v2){
        if (root.data < v1 && root.data < v2)
            return lca(root.right, v1, v2);
        if (root.data > v1 && root.data > v2)
            return lca(root.left, v1, v2);

        return root;
    }

}
