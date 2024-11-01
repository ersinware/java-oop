public class Main {
    /*
    Class Adapter Pattern

    MyAdaptedClass sınıfının sisteme adaptesi yapılmış oldu.
    Buradaki amaç şu, MyInterface'i implemente eden başka sınıflar (projede yok. Örnek olarak)
    zaten sisteme dahildi ve Main sınıfı tarafından kullanılıyordu.
    MyAdaptedClass sınıfı da sisteme dahil edilmek isteniyordu
    Bu yüzden MyAdapter sınıfı MyInterface'i implemente edip MyAdaptedClass sınıfını miras aldı.
    Main sınıfı, MyInterface interface'ini implemente eden sınıfları kullandığı için
    MyAdaptedClass sınıfının özelliklerini de kullanabilir.
    */
    public static void main(String[] args) {
        MyInterface myInterface = new MyAdapter();
        myInterface.methodOfMyInterface();
    }
}