public class Car {
    private Brand brand;
    private Modal modal;
    private String color;
    private int hp;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Modal getModal() {
        return modal;
    }

    public void setModal(Modal modal) {
        this.modal = modal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void printCar() {
        System.out.println(brand);     // toString() metodu override edildiği için o metotta belirtilen değer döner
        System.out.println(modal);     // toString() metodu override edildiği için o metotta belirtilen değer döner
        System.out.println(color);
        System.out.println(String.valueOf(hp));
    }
}
