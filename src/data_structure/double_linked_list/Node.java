package data_structure.double_linked_list;

import java.util.Objects;

public class Node {
    private int value;
    private Node next;
    private Node prev;

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public Node(int value) {
        this.value = value;
    }

    boolean hasNext() {
        return Objects.nonNull(next);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
