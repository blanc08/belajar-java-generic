package blanc08.generic.application;

import blanc08.generic.MyData;

public class InvariantApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Bagus");
//        doIt(stringMyData); // error
//        MyData<Object> objectMyData = stringMyData;

        MyData<Object> objectMyData = new MyData<>(1000);
//        MyData<Integer> integerMyData = objectMyData;
//        doItInteger(objectMyData);
    }

    public static void doIt(MyData<Object> objectMyData) {
//         do nothing
    }

    public static void doItInteger(MyData<Integer> integerMyData) {
//         do nothing
    }
}
