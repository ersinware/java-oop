public class FordOrderBuilder extends OrderBuilder {
    @Override
    public void setBrand(String brand) {
        getCar().setBrand(new Brand("Ford"));
    }

    @Override
    public void setModal(String modal) {
        getCar().setModal(new Modal(modal));
    }

    @Override
    public void setColor(String color) {
        getCar().setColor(color);
    }

    @Override
    public void setHp(int hp) {
        getCar().setHp(hp);
    }
}
