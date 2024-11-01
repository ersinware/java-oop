public class Main {
    /*
    Yapıcı tasarım şablonu ne zaman kullanılır?
    Değişik parametreler kullanılarak karmaşık yapıda bir nesnenin oluşturulması gerektiğinde.
    Karmaşık yapıya sahip nesnenin oluşturulma sürecinin, sistemin diğer bölümlerinden bağımsız
    bir şekilde yapılması gerektiği durumlarda.

    Yapıcı tasarım şablonu bunun yanı sıra akıcı programlama arayüzleri (fluent API )
    oluşturmak için kullanılan tasarım şablonudur.

    İlişkili tasarım şablonları
    Composite Tasarım şablonunda oluşturulan composite nesne builder tasarım şablonunda
    oluşturulan karmaşık nesne gibidir. Ayrıca abstract factory kullanılarak karmaşık nesneler oluşturulabilir
    */

    /*
    birden fazla somut OrderBuilder sınıfının yazılmasının sebebi, bu sınıflarda farklı spesifik işlemler yapılabilme ihtimalidir
    eğer böyle bir ihtiyaç yoksa yalnız bir somut OrderBuilder sınıfı kullanılabilir
     */
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        Car focus = orderManager.createOrder("Ford", "Focus", "White", 70);
        focus.printCar();

        Car a4 = orderManager.createOrder("Audi", "A4", "Black", 130);
        a4.printCar();

        FluentOrderBuilder.startBuilding()
                .withBrand(new Brand("BMW"))
                .withModal(new Modal("i320"))
                .withColor("Blue")
                .withHp(100)
                .build()
                .printCar();
    }
}
