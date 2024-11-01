public class Volvo implements Car {
    /*
    birden fazla implemente yapılabilir
    implemente edilen tüm interface'lerin metodları override edilmek zorundadır
     */
    @Override
    public void startEngine() {
        System.out.println("Engine is started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine is stopped");
    }
}
