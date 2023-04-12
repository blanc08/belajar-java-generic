package blanc08.generic.application;

import blanc08.generic.Person;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparableApp {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Bagus", "JL Contoh 1"),
                new Person("Joko", "JL Contoh 2"),
                new Person("Ida", "JL Contoh 3")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
