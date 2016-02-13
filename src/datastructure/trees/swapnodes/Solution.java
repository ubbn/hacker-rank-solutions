package datastructure.trees.swapnodes;

import java.util.*;

/**
 * Created by buyan on 2/13/16.
 */

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    int depth;
    TreeNode(int data, int depth){
        this.data = data;
        this.depth = depth;
    }
}

public class Solution {

    static TreeNode ReadTree(Scanner stdin){
        int nodes = stdin.nextInt();

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        TreeNode head = new TreeNode(1, 1);
        nodeQueue.add(head);
        for (int i = 0; i < nodes; i++) {
            int left = stdin.nextInt();
            int right = stdin.nextInt();
            TreeNode tmp = nodeQueue.poll();
            if (left != -1){
                tmp.left = new TreeNode(left, tmp.depth+1);
                nodeQueue.add(tmp.left);
            }
            if (right != -1){
                tmp.right = new TreeNode(right, tmp.depth+1);
                nodeQueue.add(tmp.right);
            }
        }

        return head;
    }

    static void PrintInOrder(TreeNode head){
        if (head.left != null)
            PrintInOrder(head.left);
        System.out.print(head.data + " ");
        if (head.right != null)
            PrintInOrder(head.right);
    }

    static void Swap(TreeNode head, int nodeDepth, int multiplier){
        if (head == null)
            return;

        if (head.depth == nodeDepth * multiplier){
            TreeNode tmp = head.left;
            head.left = head.right;
            head.right = tmp;
            multiplier++;
        }

        Swap(head.left, nodeDepth, multiplier);
        Swap(head.right, nodeDepth, multiplier);
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        TreeNode head = ReadTree(stdin);

        int times = stdin.nextInt();
        while(times-->0){
            Swap(head, stdin.nextInt(), 1);
            PrintInOrder(head);
            System.out.println();
        }

        stdin.close();
    }
}