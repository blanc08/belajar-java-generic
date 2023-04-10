package blanc08.generic.application;

import blanc08.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String,  Integer> pair = new Pair<>("Test", 100);

        String pairFirst = pair.getFirst();
        Integer pairSecond = pair.getSecond();

        System.out.println(pairFirst);
        System.out.println(pairSecond);
    }
}
