package Lect13_CipherSchools;

import java.util.HashSet;

public class RemoveDuplicatedUnsorted {


    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;

        void removeDuplicates() {
            if (head == null)
                return;

            HashSet<Integer> uniqueValues = new HashSet<>();
            Node current = head;
            Node previous = null;

            while (current != null) {
                if (uniqueValues.contains(current.data)) {
                    previous.next = current.next;
                } else {
                    uniqueValues.add(current.data);
                    previous = current;
                }
                current = current.next;
            }
        }
    }

}
