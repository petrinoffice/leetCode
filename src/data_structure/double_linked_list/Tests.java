package data_structure.double_linked_list;


import java.util.Objects;

class Tests {
    public static void main(String[] args) {
        DoubleLinkedListP list = new DoubleLinkedListP(2);
        check(1, list.length());

        System.out.println(list);

        list.append(3);
        System.out.println(list);
        check(2, list.length());

        check(3, list.removeLast().getValue());
        System.out.println(list);
        check(2, list.get(0).getValue());
        check(1, list.length());

        prependTests();

        check(1, list.removeFirst().getValue());
        check(2, list.get(0).getValue());
        check(1, list.length());

        list.prepend(1);
        list.append(3);
        list.append(4);
        System.out.println(list);
        check(4, list.length());
        check(4, list.get(3).getValue());
        check(1, list.get(0).getValue());

        check(true, list.set(2, 33));
        check(false, list.set(99, 33));
        System.out.println(list);
        check(4, list.length());
        check(33, list.get(2).getValue());

        list.insert(2, 22);
        System.out.println(list);
        check(5, list.length());

        list.remove(2);
        System.out.println(list);
        check(4, list.length());

        list.reverse();
        System.out.println(list);
        check(4, list.length());
        check(4, list.get(0).getValue());
        check(1, list.get(3).getValue());
        check(4, list.getFirst().getValue());
        check(1, list.getLast().getValue());
    }

    private static void prependTests() {
        DoubleLinkedListP empty = new DoubleLinkedListP(99);
        empty.removeFirst();

        check(null, empty.getFirst());
        empty.prepend(1);
        System.out.println(empty);
        check(1, empty.get(0).getValue());
        check(1, empty.length());

        DoubleLinkedListP withData = new DoubleLinkedListP(1);
        check(1, empty.getFirst().getValue());
        check(1, empty.getLast().getValue());
        withData.prepend(2);
        check(1, empty.getFirst().getValue());
        check(2, empty.getLast().getValue());
        check(2, empty.length());
    }

    private static void check(int check, int result) {
        if (check != result) {
            throw new AssertionError("Should %s but was %s".formatted(check, result));
        }
    }

    private static void check(boolean check, boolean result) {
        if (check != result) {
            throw new AssertionError("Should %s but was %s".formatted(check, result));
        }
    }

    private static void check(Object check, Node result) {
        if(check == null && result == null){
            return;
        }

        if (check != result) {
            throw new AssertionError("Should %s but was %s".formatted(check, result));
        }
    }
}
