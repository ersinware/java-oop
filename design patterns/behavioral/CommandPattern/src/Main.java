public class Main {
    /*
    Komut tasarım şablonunu açıklamak için televizyonu uzaktan yönetme aletini metafor olarak
    kullanmak istiyorum. Kanalları değiştirmek için yönetme aleti üzerinde belirli bir tuşa basarız.
    Tuşa basıldığı anda yönetme aleti televizyona bir komut göndererek, kanalın değişmesini sağlar.
    Aynı şekilde televizyonu açıp, kapatmak ve ses ve renk ayarlarını yapmak için değişik tuşlar
    kullanılır.
    Kullanıcı olarak tuşa basıldığında televizyon bünyesinde ne gibi bir işlemin yapıldığı hakkında bilgi
    sahibi olmamız gerekmiyor. Bunu alıcının (televizyon) bilmesi yeterlidir. Bilmemiz gereken tek şey,
    hangi tuşun altında hangi komutun olduğudur.
    Bir nesne üzerinde bir işleminin nasıl yapıldığını bilmediğimiz ya da kullanılmak istenen nesneyi
    tanımadığımız durumlarda, komut tasarım şablonu ile yapılmak istenen işlemi bir nesneye
    dönüştürerek, alıcı nesne tarafından işlemin yerine getirilmesi sağlayabiliriz.

    Komut tasarım şablonu ne zaman kullanılır?
    Yapmak istediğimiz işlemi ya da işlemin ait olduğu nesneyi tanımadığımız durumlarda komut
    tasarım şablonu kullanılır. Bir komut haline getirilen işlem, alıcı nesneye iletilerek, işlem
    gerçekleştirilir. Böylece komutu gönderen nesne ile işlemi gerçekleştirien nesne arasında esnek bir
    bağ oluşturulur. İki nesne birbirini tanımak zorunda değildir.

    İlişkili tasarım şablonları
    Komut tasarım şablonu memento nesneleri kullanarak, yapılan işlemlerin tekrar geri alınmasında
    sağlayabilir. Chain of responsibility tasarım şablonu command nesnelerini istek (request) nesnesi
    olarak kullanabilir
     */

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.execute(RemoteControl.COMMAND_OPEN);
        remoteControl.execute(RemoteControl.COMMAND_CLOSE);
    }
}
