public class GreenFactory implements AbstractFactory {
    @Override
    public Apple getApple() {
        return new GreenApple();
    }

    @Override
    public Pepper getPepper() {
        return new GreenPepper();
    }
}
