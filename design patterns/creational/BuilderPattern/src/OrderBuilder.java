public abstract class OrderBuilder {
    private Car car;

    public Car getCar() {
        if (car == null) car = new Car();
        return car;
    }

    public abstract void setBrand(String brand);

    public abstract void setModal(String modal);

    public abstract void setColor(String color);

    public abstract void setHp(int hp);

}
