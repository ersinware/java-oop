public class AudiFactory extends CarFactory {
    /*
    Bu sınıf Audi marka arabaları üretir. CarFactory sınıfının altsınıfı olduğu için createCar metodunu implemente eder.
     */

    /*
    CarFactory sınıfında yer alan createCar() metodu AudiFactory altsınıfında implemente edilir.
    Bu metot Audi markasina ait A4 model arabayı üretmek için kullanılır.
     */
    @Override
    public void createCar() {
        getCarList().add(new AudiA4(100));
        getCarList().add(new AudiR8(250));
    }
}
