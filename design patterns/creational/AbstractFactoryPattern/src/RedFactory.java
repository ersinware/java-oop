public class RedFactory implements AbstractFactory {
    @Override
    public Apple getApple() {
        return new RedApple();
    }

    @Override
    public Pepper getPepper() {
        return new RedPepper();
    }
}
