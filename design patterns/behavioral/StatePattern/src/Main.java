public class Main {
    /*
    Bir nesne sahip olduğu duruma göre (değişkenlerin değerleri) davranışını (sahip olduğu metotlar)
    değiştirebilir mi? Normal şartlar altında bu sorunu cevabı hayır olurdu. Ama durum tasarım
    şablonu ile bu mümkün!
    Durum tasarım şablonu kullanarak, bir nesnenin davranışı, sahip olduğu değerler değiştiği zaman
    değiştirilebilir. Bu durumda sanki nesne sahip olduğu sınıfı değiştirmiş gibi olacaktır.

    Engine sınıfında State tipinde bir
    sınıf değişkeni yer alıyor. Motorun açılıp, kapatılabilmesi için gerekli metotları State ismini taşıyan
    bir interface sınıfı bünyesine taşıyoruz. Motorun sahip olabileceği (kapalı, çalışır) her durum için
    State sınıfını implemente edecek bir altsınıf oluşturmamız gerekiyor. Engine sınıfının start() ve
    stop() metotları kullanıldığında, bunlar state nesnesine delege edilecektir. UML diyagramında
    durumu değiştiği zaman davranışı da değişen nesne Engine sınıfıdır. Hedefimiz motorun sahip
    olduğu duruma göre davranışını değiştirmektir.

    Durum tasarım şablonu ne zaman kullanılır?
    Bir nesnenin davranışları (metot yapısı) sahip olduğu duruma bağlı olabilir. Nesnenin sahip olduğu
    durumun değişmesi halinde davranışının da değişmesi gerektigi durumlarda durum tasarım
    şablonu kullanılır.

    İlişkili tasarım şablonları
    Durum nesneleri genelde singleton olarak implemente edilir. Durum nesneleri ortak kullanılıyorsa,
    flyweight tasarım şablonu uygulanmış olur.

     */
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.start();
        engine.start();
        engine.stop();
        engine.stop();
        engine.start();
        engine.stop();
    }
}
