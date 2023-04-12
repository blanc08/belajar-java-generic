package blanc08.generic.application;

import blanc08.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Bagus");
         objectMyData.setData(1000); // Bahaya dan Error
        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        Object value =  myData.getData();
        System.out.println("Process parameter " + value);
        myData.setData("Bagus2");
    }
}
