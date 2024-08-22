package leet;

public class N141_Linked_List_Cycle {
    public static void main(String[] args) {

    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null) {
            slow = slow.next;

            if (fast.next == null) {
                return false;
            }
            fast = fast.next.next;


            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

}
