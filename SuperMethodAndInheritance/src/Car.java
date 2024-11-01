import java.util.List;

public class Car {
    private String modal;
    private String brand;
    private List<Accessory> listAccessories;

    public Car(String brand, String modal, List<Accessory> listAccessories) {
        this.modal = modal;
        this.brand = brand;
        this.listAccessories = listAccessories;
    }

    public String getModal() {
        return modal;
    }

    public String getBrand() {
        return brand;
    }

    public List<Accessory> getListAccessories() {
        return listAccessories;
    }
}
