package data_structure.linked_list;

class Tests {
    public static void main(String[] args) {
        LinkedListP list = new LinkedListP(2);
        check(1, list.length());

        System.out.println(list);

        list.append(3);
        System.out.println(list);
        check(2, list.length());

        check(3, list.removeLast().getValue());
        System.out.println(list);
        check(2, list.get(0).getValue());
        check(1, list.length());

        list.prepend(1);
        System.out.println(list);
        check(1, list.get(0).getValue());
        check(2, list.length());

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
}
