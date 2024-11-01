public abstract class Car {
    private String brand;
    private String modal;
    private int hp;

    public Car(final String brand, final String modal, final int hp) {
        setBrand(brand);
        setModal(modal);
        setHp(hp);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(final String modal) {
        this.modal = modal;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(final int hp) {
        this.hp = hp;
    }
}
