package datastructure.trees.treetraversal;

import java.util.*;

/**
 * Created by buyan on 1/23/16.
 */

class Node {
    int data;
    Node left;
    Node right;
}
public class Solution {

    // Task 1
    void Preorder(Node root) {
        System.out.print(root.data + " ");
        if (root.left != null)
            Preorder(root.left);
        if (root.right != null)
            Preorder(root.right);
    }

    // Task 2
    void Postorder(Node root) {
        if (root.left != null)
            Postorder(root.left);
        if (root.right != null)
            Postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Task 3
    void Inorder(Node root) {
        if (root.left != null)
            Inorder(root.left);
        System.out.print(root.data + " ");
        if (root.right != null)
            Inorder(root.right);
    }

    // Task 4
    void top_view(Node root){
        // To store left top view
        Stack<Integer> stackForLeft = new Stack<>();
        // To store right top view
        LinkedList<Integer> queueForRight = new LinkedList<>();

        Node tempNode = root;
        while(tempNode!=null){
            queueForRight.addLast(tempNode.data);
            tempNode = tempNode.right;
        }
        tempNode = root.left;
        while(tempNode!=null){
            stackForLeft.push(tempNode.data);
            tempNode = tempNode.left;
        }

        while(!stackForLeft.isEmpty())
            System.out.print(stackForLeft.pop() + " ");

        for(int i : queueForRight)
            System.out.print(i + " ");
    }
    
    // Task 5
    void LevelOrder(Node root)
    {
        Stack<Node> nodes = new Stack<>();
        Stack<Integer> levels = new Stack<>();
        Map<Integer, List<Integer>> nodeData = new TreeMap<>();
        
        nodes.push(root);
        levels.push(1);
        while(!nodes.isEmpty()){
            Node node = nodes.pop();
            int level = levels.pop();
            
            if (!nodeData.containsKey(level))
                nodeData.put(level, new ArrayList<Integer>());
            nodeData.get(level).add(node.data);    
            
            if (node.left != null || node.right != null){
                level++;
                if (node.right != null){
                    nodes.push(node.right);
                    levels.push(level);
                }
                if (node.left != null){
                    nodes.push(node.left); 
                    levels.push(level);
                }
            }
        }
        
        for(int key : nodeData.keySet())
            for (int value : nodeData.get(key)) 
                System.out.print(value + " ");
    }

}
