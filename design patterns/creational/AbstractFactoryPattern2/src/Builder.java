import java.util.ArrayList;

public class Builder {
    private final ArrayList<Product> products = new ArrayList<>();

    public void order(ProductFactory productFactory) {
        products.add(productFactory.create(ProductFactory.CREATE_CONSOLE));
        products.add(productFactory.create(ProductFactory.CREATE_CONTROLLER));
    }

    public void displayProducts() {
        products.forEach(product -> System.out.println(product.getName()));
    }
}
