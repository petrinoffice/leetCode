package data_structure.double_linked_list;

import java.util.Objects;

public class DoubleLinkedListP implements DoubleLinkedListInterface {
    private Node head;
    private Node tail;
    private int length;

    public DoubleLinkedListP(int value) {
        Node temp = new Node(value);
        this.head = temp;
        this.tail = temp;
        length++;
    }

    @Override
    public void append(int value) {
        if (length == 0) {
            Node temp = new Node(value);
            this.head = temp;
            this.tail = temp;
        } else {
            Node temp = new Node(value, null, tail);
            tail.setNext(temp);
            tail = temp;
        }
        length++;
    }


    @Override
    public void prepend(int value) {
        Node temp = new Node(value, head, null);

        if(head!=null) {
            head.setPrev(temp);
        }
        head = temp;
        length++;
    }

    @Override
    public Node removeLast() {
        if (length == 0) {
            return null;
        }

        if (length == 1) {
            Node temp = head;
            head = null;
            tail = null;

            temp.setPrev(null);
            return temp;
        }

        Node temp = tail;
        tail = tail.getPrev();
        tail.setNext(null);

        temp.setPrev(null);

        length--;
        return temp;
    }

    @Override
    public Node removeFirst() {
        if(length == 0){
            return null;
        }

        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;

            length--;
            return temp;
        }

        head = temp.getNext();
        head.setPrev(null);
        length--;

        return temp;
    }

    @Override
    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        if (index == 0) {
            return getFirst();
        }

        if (index == length - 1) {
            return getLast();
        }

        if (index > length / 2) {
            Node temp = tail;
            for (int i = length; i > index; i--) {
                temp = temp.getPrev();
            }
            return temp;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }

            return temp;
        }
    }

    @Override
    public boolean set(int index, int value) {
        return false;
    }

    @Override
    public boolean insert(int index, int value) {
        return false;
    }

    @Override
    public Node remove(int index) {
        return null;
    }

    @Override
    public void reverse() {

    }

    public int length() {
        return length;
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        return tail;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        Node node = head;
        while (Objects.nonNull(node)) {
            builder.append(node.getValue());
            builder.append(" -> ");

            node = node.getNext();
        }

        builder.append("null");

        return builder.toString();
    }
}
