public class Main {
    /*
    Prototip tasarım şablonu ne zaman kullanılır?
    Bir sistem bünyesinde büyük ve oluşturulmaları zaman alıcı nesneler bulunduğu taktirde.

    İlişkili tasarım şablonları
    Prototip yerine soyut fabrika kullanılabilir. Bunun yanı sıra soyut fabrika bünyesinde prototip
    yardımıyla gerçek nesneler de oluşturmak mümkündür. Fabrika metodunda kalıtım kullanılırken,
    prototip bünyesinde yeni nesne oluşturma işlemi delegasyon yöntemi ile yapılmaktadır???
    */
    public static void main(String[] args) throws CloneNotSupportedException {
        Adress adress = new Adress("Street1", "NO1", "District1", "City1");
        adress.printAdress();

        System.out.println("-");

        Adress adress2 = (Adress) adress.clone();
        adress2.setStreet("Street2");
        adress2.setNo("NO2");
        adress2.setDistrict("District2");
        adress2.setCity("City2");
        adress2.printAdress();

        System.out.println("-");

        Adress adress3 = (Adress) adress2.clone();
        adress3.setStreet("Street3");
        adress3.setNo("NO3");
        adress3.setDistrict("District3");
        adress3.setCity("City3");
        adress3.printAdress();
    }
}
