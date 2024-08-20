package dataStructure;

public interface LinkedListInterface {
    @Override
    String toString();

    void append(int value);

    void prepend(int value);

    Node removeLast();

    Node removeFirst();

    Node get(int index);

    boolean set(int index, int value);

    boolean insert(int index, int value);

    Node remove(int index);

    void reverse();
}
