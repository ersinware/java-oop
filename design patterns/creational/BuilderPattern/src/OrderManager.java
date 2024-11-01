public class OrderManager {
    private OrderBuilder orderBuilder;

    public Car createOrder(String brand, String modal, String color, int hp) {
        if (brand.equals("Ford")) orderBuilder = new FordOrderBuilder();
        else if (brand.equals("Audi")) orderBuilder = new AudiOrderBuilder();
        orderBuilder.setBrand(brand);
        orderBuilder.setModal(modal);
        orderBuilder.setColor(color);
        orderBuilder.setHp(hp);
        return orderBuilder.getCar();
    }
}
