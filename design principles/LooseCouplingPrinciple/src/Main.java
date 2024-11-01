import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String args[]) {
        RemoteControllerInterface television = new Television();
        RemoteController tvController = new RemoteController(television);
        tvController.on();

        RemoteControllerInterface radio = new Radio();
        RemoteController radioController = new RemoteController(radio);
        radioController.on();

        RemoteControllerInterface mp3Player = new Mp3Player();
        RemoteController mp3Controller = new RemoteController(mp3Player);
        mp3Controller.on();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                tvController.off();
                radioController.off();
                mp3Controller.off();
                timer.cancel();
            }
        }, 5000);
    }
}
