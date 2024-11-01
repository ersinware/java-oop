public class SonyFactory extends ProductFactory {
    @Override
    public Product create(int code) {
        if (code == ProductFactory.CREATE_CONSOLE)
            return new PS5("PS5 Console", 1000);

        if (code == ProductFactory.CREATE_CONTROLLER)
            return new PS5Controller("PS5 Controller", 200);

        throw new RuntimeException("unknown code");
    }
}
