import Implementations.GreenProducer;
import Implementations.Producer;
import Implementations.RedProducer;

/*
Köprü tasarım şablonu ne zaman kullanılır?
Sistemde tanımlanmış olan soyut sınıflar ve bu sınıfların implementasyonu ayırmak
isteniyorsa; Böyle bir ayrım, programın çalışma esnasında (runtime) değişik implementasyonların kullanılmasına izin vermektedir.
Karmaşık sınıf hirarşileri modellemek yerine, köprü tasarım şablonu ile sistem daha esnek ve bakımı kolay hale getirilmek istendiğinde.

İlişkili tasarım şablonları
Abstract Factory köprü oluşumunda kullanılabilir. Adaptör tasarım şablonu ile sistem içinde
bulunan sınıflar başka sınıflar tarafından kullanılacak şekilde adapte edilebilir. Adaptör tasarım
şablonu, çoğu zaman sistem tasarlandıktan sonra uygulanır. Buna karşın köprü tasarım şablonu,
sistemin oluşturulması esnasında, soyut sınıfları ve sahip oldukları implementasyonları ayrıştırmak
için kullanılmaktadır

Sağlıklı bir model oluşturabilmek için ürünler ile üretildikleri fabrikalar arasındaki bağı azaltmamız ya da
ortadan kaldırmamız gerekmektedir.

Köprü tasarım şablonunu kullanabilmek için soyut metodları ve bu metotların implementasyonlarını ayırmak gerek.
Bu ayırma işlemini gerçekleştirmek için gerekli tüm soyut metotlar Producer interface sınıfına taşındı.
Bu metotları ve implementasyonlarını kullanabilmek için Product sınıfında producer isminde bir değişken
tanımlamamız gerekmektedir

Product nesneleri ve bu nesnelerin üretildikleri fabrikalar arasındaki ilişkiyi ortadan kaldırmış
ve bu ilişkiyi Product sınıfında bulunan producer değişkenine taşımış olduk.
Product sınıfında tanımladığımız producer ismindeki değişken ile Product ve Producer arasında köprü oluşturmuş oluyoruz.
Bu noktadan itibaren Product sınıfı, producer değişkeninin sahip olduğu değere göre,
bu GreenProducer ya da RedProducer sınıfından bir nesne olabilir,
üretim için gerekli fabrikayı kullanacaktır
 */

public class Main {
    public static void main(String[] args) {
        /*
        Sisteme yeni bir Producer sınıfı veya Product sınıfı rahatlıkla dahil edilebilir.
         */
        Producer greenProducer = new GreenProducer();
        Producer redProducer = new RedProducer();

        Product greenPencil = new Pencil(greenProducer);
        greenPencil.produce();
        Product redPencil = new Pencil(redProducer);
        redPencil.produce();
        /*
        Tek bir Product'ı miras alan nesne üzerinden de Producer nesnesi değiştirilerek işlem yapılabilir.
         */
        Product notebook = new Notebook(greenProducer);
        notebook.produce();
        notebook.setProducer(redProducer);
        notebook.produce();
    }
}
