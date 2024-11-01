public class Main {
    /*
    Mevcut bir sınıf hirarşisini ya da sınıfın yapısını değiştirmeden, oluşturulan nesnelere yeni
    özelliklerin eklenme işlemini gerçekleştirmek için dekoratör tasarım şablonu kullanılmaktadır.
    Altsınıfların oluşturulması yöntemiyle sınıflara yeni özelliklerin eklenmesi, daha sonra sisteme
    eklenecek altsınıflar için değiştirilmesi zor kalıpların oluşmasını beraberinde getirmektedir. Bu
    durumda üstsınıflarda tanımlanmış olan bazı özellikler statik ve altsınıflar için değistirilemez ya da
    kullanımı engellenemez bir hal alabilir. Kullanıcı sınıflar için de bu durum sorun teşkil
    edebilmektedir, çünkü kendi istekleri doğrultusunda bir nesnenin ne zaman ve nasıl oluşturulması
    gerektiğini yönlendiremeyebilirler.
    Nesnelere sahip oldukları sınıfların yapılarının değistirilmeden yeni özelliklerin eklenmesini
    sağlayan dekoratör tasarım şablonu ile istenilen özelliklerin ekleneceği nesne başka bir nesne içine
    gömülür. Yeni özellik eklenen nesneyi içine alan nesneye dekoratör ismi verilir. Dekoratör nesnesi
    ile yeni özellik eklenen nesne aynı üstsınıfa dahil olduklarından, birbirleriyle değiştirilebilir
    haldedirler. Bu özellikten dolayı kullanıcı sınıf, dekoratör sınıf ile dekoratör nesne bünyesinde
    bulunan diğer nesne arasında ayrım yapmaz

    Sonuç itibariyle aynanın ve aynalı ürünlerin üretimini birbirinden ayırmış olduk ve mevcut bir
    nesneye (Ayna), sahip olduğu sınıfın yapısını değiştirmeden yeni bir özellik (çerçeve) ekleyebildik.
     */

    /*
    Dekoratör tasarım şablonu ne zaman kullanılır?
    Mevcut nesnelere sınıf yapıları değiştirilmeden yeni özelliklerin eklemesi gerektiği durumlarda.
    Sınıflara daha sonra kullanımdan kaldırılmak üzere yeni metot ve fonksiyonların eklemesi
    gerektiği durumlarda.
    Sınıf yapısının ya da sınıf hirarşilerinin yeni özelliklerin eklenmesine izin vermedikleri
    durumlarda.

    İlişkili tasarım şablonları
    Dekoratör ve adaptör arasındaki tek farklılık, dekoratör tasarım şablonunun nesnenin sunduğu
    fonksiyonları değiştirmesidir. Dekoratör nesnenin dış dünyaya sunduğu metot yapılarını
    değiştirmez. Adaptör tasarım şablonu ile nesnenin dış dünyaya sunduğu metot yapıları tamamen
    değiştirilir.
    Dekoratör ile bir nesnenin dış görüntüsü değiştirilir. Strateji tasarım şablonu nesnenin iç dünyasını
    değiştirir. Kullanılan strateji tipine göre nesne başka türlü bir davranış sergileyecektir.
     */
    public static void main(String[] args) {
        HouseGood mirror = new Mirror();
        mirror.produce();

        System.out.println("-");

        HouseGood mirrorWithFrame = new MirrorWithFrame();
        mirrorWithFrame.produce();
    }
}
