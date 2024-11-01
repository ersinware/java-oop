import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Accessory> listAccessories = new ArrayList<>();
        listAccessories.add(new Accessory("Electronic Seat"));

        Car car = new Volvo("2007", listAccessories);

        System.out.println("Brand\n  " + car.getBrand());
        System.out.println("Modal\n  " + car.getModal());

        System.out.println("Accessories");
        for (Accessory volvoAccessory : car.getListAccessories())
            System.out.println("  " + volvoAccessory.getName());
    }
}
