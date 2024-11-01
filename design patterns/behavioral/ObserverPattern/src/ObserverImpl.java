public class ObserverImpl implements ObserverI {
    @Override
    public void update() {
        System.out.println("the object is informed - " + toString());
    }
}
