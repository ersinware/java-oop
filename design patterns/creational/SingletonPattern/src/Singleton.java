public class Singleton {
    //direkt olarak burada private static Singleton instance = new Singleton() yapılabilir, thread safe olur
    /*
    başka sınıfların new anahtar sözcüğü ile bu sınıftan nesne türetememesi için constructor private olarak tanımlı
    */
    private Singleton() {
        System.out.println("Singleton object is derived");
    }

    /*
    double checked locking yapabilmek için kullanılan nesne
    */
    private static Object lock = new Object();

    private static volatile Singleton instance;

    /*
    Singleton sınıfının nesnesine ulaşabilmek için getInstance() metodu kullanılmaktadır
    */
    public static Singleton getInstance() {
        if (instance == null) {
            // double checked locking
            synchronized (lock) {
                if (instance == null) instance = new Singleton();
            }
        }
        return instance;
    }

    public void print() {
        System.out.println("print method of Singleton object is called, this is : " + this.toString());
    }
}

/*
public class sixth_SingletonSafety {

    private static volatile sixth_SingletonSafety instance = null;
    private static final Object mutex = new Object();

    private sixth_SingletonSafety() {

    }

    //The local variable result seems unnecessary. But, it’s there to improve the performance of
    //our code. In cases where the instance is already initialized (most of the time), the
    //volatile field is only accessed once (due to “return result;” instead of “return instance;”)
    //This can improve the method’s overall performance by as much as 25 percent.

    //sanırım, nesneyi, metod'un içinde, thread stack'inde, oluşturarak, volatile ile işaretlenmiş nesneye
    //her seferinde main memory üzerinden erişilmesini engelliyor
    //visibility sorunları oluşturmaz mı?
    public static sixth_SingletonSafety getInstance() {
        sixth_SingletonSafety result = instance;
        if (result == null)
            synchronized (mutex) {
                result = instance;
                if (result == null)
                    result = instance = new sixth_SingletonSafety();
            }

        return result;
    }
}
*/