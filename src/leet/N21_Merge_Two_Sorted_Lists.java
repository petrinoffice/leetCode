package leet;

public class N21_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        ListNode left = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode right = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println(new N21_Merge_Two_Sorted_Lists().mergeTwoLists(left, right));
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
                s.append(", ");

                temp = temp.next;
            }

            return s.toString();
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }


    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode head = null;
        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        ListNode temp = head;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
                continue;
            }
            if (list2 == null) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
                continue;
            }

            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }

        return head;
    }
}
