public class NintendoFactory extends ProductFactory {
    @Override
    public Product create(int code) {
        if (code == ProductFactory.CREATE_CONSOLE)
            return new Switch("Switch Console", 1000);

        if (code == ProductFactory.CREATE_CONTROLLER)
            return new JoyCon("JoyCon Controller", 200);

        throw new RuntimeException("unknown code");
    }
}
