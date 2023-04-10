package blanc08.generic.application;

import blanc08.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Bagus", "Oktaviadi"};
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(
                ArrayHelper.<String>count(names)
        );
        System.out.println(
                ArrayHelper.count(numbers)
        );

    }
}
