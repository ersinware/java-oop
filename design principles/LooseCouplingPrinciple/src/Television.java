public class Television implements RemoteControllerInterface {
    @Override
    public void on() {
        System.out.println("Television is on");
    }

    @Override
    public void off() {
        System.out.println("Television is off");
    }
}
