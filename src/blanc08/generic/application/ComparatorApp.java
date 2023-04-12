package blanc08.generic.application;

import blanc08.generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Bagus", "JL Contoh 1"),
                new Person("Joko", "JL Contoh 2"),
                new Person("Ida", "JL Contoh 3")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));
    }
}
