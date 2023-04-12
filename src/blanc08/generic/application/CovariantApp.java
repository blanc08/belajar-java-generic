package blanc08.generic.application;

import blanc08.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Bagus");
        // Covariant
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());

        // myData.setData("Bagus2"); // tidak boleh, karena berbahaya
    }
}
