package blanc08.generic.application;

public class MultipleConstraintApp {
    public static void main(String[] args) {
        // Data<Manager> managerData = new Data<>(new Manager()); // Manager tidak implement sayToHello()
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
    }

    public static interface canSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

    }

    public static class VicePresident extends Employee implements canSayHello {

        @Override
        public void sayHello(String name) {
            System.out.println("Hello : " + name);
        }
    }

    public static class Data<T extends Employee & canSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
