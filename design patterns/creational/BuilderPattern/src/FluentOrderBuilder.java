public class FluentOrderBuilder {
    private Brand brand;
    private Modal modal;
    private String color;
    private int hp;

    public static FluentOrderBuilder startBuilding() {
        return new FluentOrderBuilder();
    }

    public FluentOrderBuilder withBrand(Brand brand) {
        this.brand = brand;
        return this;
    }

    public FluentOrderBuilder withModal(Modal modal) {
        this.modal = modal;
        return this;
    }

    public FluentOrderBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public FluentOrderBuilder withHp(int hp) {
        this.hp = hp;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setBrand(brand);
        car.setModal(modal);
        car.setColor(color);
        car.setHp(hp);
        return car;
    }
}
