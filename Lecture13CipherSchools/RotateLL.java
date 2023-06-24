package Lect13_CipherSchools;

public class RotateLL {
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

        // Function to rotate the linked list by a given number of positions
        Node rotate(int k) {
            if (head == null || k == 0)
                return head;

            // Step 1: Find the length of the linked list
            int length = 0;
            Node current = head;
            while (current != null) {
                length++;
                current = current.next;
            }

            // Step 2: Calculate the actual number of rotations
            int rotations = k % length;

            // Step 3: No rotation needed
            if (rotations == 0)
                return head;

            // Step 4: Find the new tail and the node just before it
            Node tail = head;
            Node prevTail = null;
            for (int i = 0; i < length - rotations; i++) {
                prevTail = tail;
                tail = tail.next;
            }

            // Step 5: Perform the rotation
            prevTail.next = null;
            Node newHead = tail;
            while (tail.next != null)
                tail = tail.next;
            tail.next = head;

            // Step 6: Return the new head of the rotated linked list
            return newHead;
        }
    }

}
