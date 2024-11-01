import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Car car = new Volvo();
        /*
        ya da Volvo car = new Volvo();
         */
        System.out.println(car.getClass());
        car.startEngine();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                car.stopEngine();
                timer.cancel();
            }
        }, 3000);
    }
}
