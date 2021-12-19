public class Exercise1 {
    //..........................*   traiin for functional interface   *...................//
    public static void main(String[] args) {

        MyIn m = new MyClass();
    }

    @FunctionalInterface
    interface MyIn {
        void f();

        default int n(int n) {
            return n;
        }
    }

    static class MyClass implements MyIn{

        @Override
        public void f() {
            System.out.println("salam");
        }
        public int n(int g){
            return g;
        }
    }

    class Apple {
        int size;

        public Apple(int size) {
            this.size = size;
        }

    }
}
