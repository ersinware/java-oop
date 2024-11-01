public class Mp3Player implements  RemoteControllerInterface {
    @Override
    public void on() {
        System.out.println("Mp3 Player is on");
    }

    @Override
    public void off() {
        System.out.println("Mp3 Player is off");
    }
}
