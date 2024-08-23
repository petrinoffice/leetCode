package leet;

public class N2_Add_Two_Numbers {
    public static void main(String[] args) {
        ListNode left = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode right = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9)))))));
        System.out.println(new N2_Add_Two_Numbers().addTwoNumbers(left, right));
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        int left = l1 == null ? 0 : l1.val;
        int rigth = l2 == null ? 0 : l2.val;

        int sum = left + rigth;

        ListNode nextL = l1 == null ? null : l1.next;
        ListNode nextR = l2 == null ? null : l2.next;

        ListNode temp = null;
        if (sum > 9) {
            temp = new ListNode(sum - 10);
            if (nextL != null) {
                nextL.val = nextL.val + 1;
            } else if (nextR != null) {
                nextR.val = nextR.val + 1;
            } else {
                nextL = new ListNode(1);
            }
        } else {
            temp = new ListNode(sum);
        }

        temp.next = addTwoNumbers(nextL, nextR);
        return temp;
    }

}
