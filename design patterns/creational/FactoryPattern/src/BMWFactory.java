public class BMWFactory extends CarFactory {
    /*
    Bu sınıf BMW marka arabaları üretir. CarFactory sınıfının altsınıfı olduğu için createCar metodunu implemente eder.
     */

    /*
    CarFactory sınıfında yer alan createCar() metodu BMWFactory altsınıfında implemente edilir.
    Bu metot BMW markasina ait Z4 model arabayı üretmek için kullanılır.
     */
    @Override
    public void createCar() {
        getCarList().add(new BMWZ4(170));
    }
}
