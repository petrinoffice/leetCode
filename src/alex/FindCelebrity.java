package alex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCelebrity {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person(person1);
        Person person3 = new Person(person1);
        Person person4 = new Person(person1);
        Person person5 = new Person(person1);
        Person person6 = new Person(person1);

        Person[] people = {person2, person3, person4, person5, person6, person1};

        System.out.println(person1);
        System.out.println(findCelebrity(people));
    }

    private static Person findCelebrity(Person[] people) {
        int left = 0;
        int right = people.length - 1;

        while (left != right) {
            if (people[left].isKnow(people[right])) {
                left++;
            } else {
                right--;
            }
        }

        Person person = people[left];
        for (Person p : people) {
            if (person.isKnow(p)) {
                return null;
            }
        }

        return person;
    }


    private static class Person {
        private final List<Person> knowPersons = new ArrayList<>();

        Person(Person... people) {
            knowPersons.addAll(Arrays.asList(people));
        }

        boolean isKnow(Person person) {
            return knowPersons.contains(person);
        }
    }
}


