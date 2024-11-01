public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();

        builder.order(new SonyFactory());
        builder.displayProducts();

        System.out.println("");

        builder.order(new NintendoFactory());
        builder.displayProducts();
    }
}
