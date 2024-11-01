public class Main {
    public static void main(String[] args) {
        /*
        createCar metodu manuel olarak çağırılmıyor.
        soyut CarFactory sınıfının constructor'unda createCar metodu çağrıldığından somut factory nesnesi yaratıldığında
        somut olan factory sınıfındaki createCar metodu çalışıyor
        */

        /*
        BMWZ4, AudiA4, AudiR8 nesneleri Car soyut sınıfının alt sınıfları olduğundan, Car sınıfı kullanılarak türetilebilirler
        (for döngüsündeki gibi veya Car car = new BMWZ4())
        */

        CarFactory bmwFactory = new BMWFactory();
        for (Car car : bmwFactory.getCarList())
            System.out.println(car.getBrand() + " - " + car.getModal() + " - " + car.getHp());

        CarFactory audiFactory = new AudiFactory();
        for (Car car : audiFactory.getCarList())
            System.out.println(car.getBrand() + " - " + car.getModal() + " - " + car.getHp());

        /*
        NE ZAMAN KULLANILIR?
        Kullanıcı sınıf hangi altsınıfların kullanılması gerektiğini bilmiyorsa;
        Örneğin Main sınıfı Z4 yada A4 model arabaları tanımıyor.

        Kullanıcı sınıf alt sınıflardan nasıl nesne üretilmesi gerektiğini bilmiyorsa;
        Örneğin Main sınıfı Z4 model bir araba üretebilmek için Z4 sınıfının constructor'ının bir int değerine ihtiyaç duyduğunu bilmiyor.

        Kullanıcı sınıf ihtiyaç duyulan nesnelerin oluşturulmasını alt sınıflara delege etmek istiyorsa;
        Örneğin Main sınıfı A4 ve R8 model Audi marka araba üretimini tamamen AudiFactory sınıfına bırakıyor.
        */

        /*
        İlişkili tasarım kalıpları :
        Builder, prototype, abstract factory ve factory method tasarım şablonları fabrika tasarım şablonu ile
        benzerlik gösterirler ve yeni nesne oluşturmak için kullanılırlar.
        */
    }
}
