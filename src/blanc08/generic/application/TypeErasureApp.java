package blanc08.generic.application;

import blanc08.generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("Bagus");
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();

    }


}
