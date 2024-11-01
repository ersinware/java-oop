public class Main {
    public static void main(String[] args) {
        /*
        Hangi adapter sınıfının kullanılacağını saklamak amacıyla Factory
        Pattern kullanılabilir
        public class MyUsingClassFactory {
            public getInstance () {
                return new MyAdapter();
            }
        }
        */
        MyUsingClass myUsingClass = new MyAdapter();
        myUsingClass.methodOfMyUsingClass();
    }
}