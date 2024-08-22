package data_structure.linked_list;

import java.util.Objects;
import java.util.Stack;

public class LinkedListP implements LinkedListInterface {
    private Node head;
    private Node tail;
    private int length;

    public LinkedListP(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length++;
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

    @Override
    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        length++;
    }

    @Override
    public void prepend(int value) {
        Node newNode = new Node(value, head);

        head = newNode;
        length++;

        if (length == 0) {
            tail = newNode;
        }
    }

    @Override
    public Node removeLast() {
        if (length == 0) {
            return null;
        }

        Node temp = head;
        Node pre = head;

        while (temp.hasNext()) {
            temp = pre;
            temp = temp.getNext();
        }

        tail = pre;
        tail.setNext(null);
        length--;

        return temp;
    }

    @Override
    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node temp = head;
        head = temp.getNext();
        temp.setNext(null);
        length--;

        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    @Override
    public Node get(int index) {
        if (isIndexFail(index)) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }

        return temp;
    }

    @Override
    public boolean set(int index, int value) {
        Node node = get(index);

        if (Objects.isNull(node)) {
            return false;
        } else {
            node.setValue(value);
            return true;
        }
    }

    @Override
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node prev = get(index - 1);
        prev.setNext(new Node(value, prev.getNext()));
        length++;
        return true;
    }

    @Override
    public Node remove(int index) {
        if (isIndexFail(index)) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == length - 1) {
            return removeLast();
        }

        Node prev = get(index - 1);
        Node current = prev.getNext();
        prev.setNext(current.getNext());

        length--;
        return current;
    }

    @Override
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.getNext();
            temp.setNext(before);
            before = temp;
            temp = after;
        }
    }

    private boolean isIndexFail(int index) {
        return index < 0 || index >= length;
    }

    public int length() {
        return length;
    }
}

