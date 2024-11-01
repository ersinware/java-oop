public class RemoteController {
    private RemoteControllerInterface rcInterface;

    public RemoteController(RemoteControllerInterface rcInterface) {
        this.rcInterface = rcInterface;
    }

    public void on() {
        rcInterface.on();
    }

    public void off() {
        rcInterface.off();
    }
}
