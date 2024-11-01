public abstract class ProductFactory {
    public static final int CREATE_CONSOLE = 0;
    public static final int CREATE_CONTROLLER = 1;

    abstract public Product create(int code);
}
