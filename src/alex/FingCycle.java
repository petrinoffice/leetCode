package alex;

import java.util.Objects;

public class FingCycle {

    private static class Node {
        private int value;
        private Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", hasNext=" + Objects.nonNull(next) +
                    '}';
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        void print(){
            Node temp = this;
            while(temp.next != null){
                System.out.print(" " + temp.value);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node cycledNode = new Node(1, node2);

        node5.next = node2;

        System.out.println(hasCycle(cycledNode));

        Node direct3 = new Node(3,  null);
        Node direct2 = new Node(1, direct3);
        Node direct1 = new Node(1, direct2);
        System.out.println(hasCycle(direct1));


        Node cycled6 = new Node(1, null);
        Node cycled5 = new Node(5, cycled6);
        Node cycled3 = new Node(3, cycled5);
        Node cycled2 = new Node(2, cycled3);
        Node cycled4 = new Node(4, cycled2);
        Node cycled1 = new Node(1, cycled4);
        cycled6.next = cycled2;
        System.out.println(findFirstNodeWithCycle(cycled1));
    }

    //Floyd cycle-finding algorithm
    private static boolean hasCycle(Node node) {
        Node slow = node;
        Node fast = node;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }

        return false;
    }

    private static Node findFirstNodeWithCycle(Node node) {
        Node slow = node;
        Node fast = node;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                break;
            }
        }

        if(fast == null){
            return null;
        }

        slow = node;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
            System.out.println("slow = " + slow.value+", fast = " + fast.value);
        }

        return slow;
    }

}
