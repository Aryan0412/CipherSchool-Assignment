package Lect13_CipherSchools;

public class Compare2LL {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public class Solution {
        public boolean isSame(ListNode head1, ListNode head2) {
            ListNode current1 = head1;
            ListNode current2 = head2;

            while (current1 != null && current2 != null) {
                if (current1.val != current2.val)
                    return false;

                current1 = current1.next;
                current2 = current2.next;
            }

            // Check if both lists reach the end
            if (current1 == null && current2 == null)
                return true;

            // Lists have different lengths
            return false;
        }
    }

}
