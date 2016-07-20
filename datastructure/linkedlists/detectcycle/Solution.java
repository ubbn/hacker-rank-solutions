package datastructure.linkedlists.detectcycle;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by buyan on 2/9/16.
 */

class Node {
    int data;
    Node next;
}

public class Solution {

    /*
      Detect cycle in the list
      head pointer input could be NULL as well for empty list
    */
    int HasCycle(Node head) {
        Set<Node> visited = new LinkedHashSet<>();

        while(head != null){
            if (visited.contains(head))
                return 1;
            else
                visited.add(head);
            head = head.next;
        }

        return 0;
    }

}
