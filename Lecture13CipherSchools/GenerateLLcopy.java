package Lect13_CipherSchools;

import java.util.HashMap;
import java.util.Map;

public class GenerateLLcopy {


    class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    class Solution {
        public Node copyRandomList(Node head) {
            if (head == null)
                return null;

            Map<Node, Node> map = new HashMap<>();

            // Create cloned nodes and add them to the map
            Node current = head;
            while (current != null) {
                map.put(current, new Node(current.val));
                current = current.next;
            }

            // Connect cloned nodes using map
            current = head;
            while (current != null) {
                Node clonedNode = map.get(current);
                clonedNode.next = map.get(current.next);
                clonedNode.random = map.get(current.random);
                current = current.next;
            }

            return map.get(head);
        }
    }

}
