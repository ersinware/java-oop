import java.util.ArrayList;

/*
Genel bir araba fabrikasini tanımlar. Soyut olduğu için bu sınıftan nesneler oluşturulamaz.
Belirli bir araba marka ve modelini üretebilmek için bu sınıfın altsınıfı oluşturulması gerekmektedir
*/
public abstract class CarFactory {
    /*
    Bir araba fabrikasının ürettiği değişik modeldeki arabalarin içinde yer aldığı liste.
    */
    private ArrayList<Car> carList = new ArrayList<Car>();

    /*
    Alt sınıflarda bir fabrikanın (nesnenin) oluşturulması ile beraber, createCar() metodu işleme girer, yani fabrika araba üretime başlamış olur.
    */
    public CarFactory() {
        createCar();
    }

    /*
    Alt sınıflar tarafından implemente edilir. Belirli bir marka ve modelin oluşturulmasında kullanılır.
    */
    public abstract void createCar();

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(final ArrayList<Car> carList) {
        this.carList = carList;
    }
}