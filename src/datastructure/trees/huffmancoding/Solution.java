package datastructure.trees.huffmancoding;

/**
 * Created by buyan on 1/28/16.
 */

class Node{
        public  int frequency; // the frequency of this tree
        public  char data;
        public  Node left, right;
}

public class Solution {
    void decode(String S ,Node root){
        Node temp = root;
        for(char c : S.toCharArray()){
            if (c == '1')
                temp = temp.right;
            else if(c == '0')
                temp = temp.left;
            else
                continue;
            if (temp.left == null && temp.right == null){
                System.out.print(temp.data);
                temp = root;
            }
        }
    }
}
