package leet;

public class N19_Remove_Nth_Node_From_End_of_List {
    public static void main(String[] args) {
        System.out.println(new N19_Remove_Nth_Node_From_End_of_List().removeNthFromEnd(
                new ListNode(1, new ListNode(2)), 1
        ));

        System.out.println(new N19_Remove_Nth_Node_From_End_of_List().removeNthFromEnd(
                new ListNode(1, new ListNode(2)), 2
        ));

        System.out.println(
                new N19_Remove_Nth_Node_From_End_of_List()
                        .removeNthFromEnd(
                                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))
                                , 2)
        );

        System.out.println(new N19_Remove_Nth_Node_From_End_of_List().removeNthFromEnd(new ListNode(1), 1));
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder();
            ListNode temp = this;
            while (temp != null) {
                s.append(temp.val);

                temp = temp.next;

                if (temp != null) {
                    s.append(", ");
                }
            }

            return s.toString();
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = null;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;

            if (slow == null) {
                slow = head;
                continue;
            }
            slow = slow.next;
        }

        if (slow != null) {
            slow.next = slow.next.next;
        } else {
            head = head.next;
        }

        return head;
    }
}
