public class Main {
    /*
    Bir nesneyi, daha önce sahip olduğu bir duruma tekrar dönüştürebilmek için memento tasarım
    şablonu kullanılır. Örneğin bir çizim programında üçgen nesneleri kullandığımızı düşünelim. Bu
    üçgenlerin boyutlarını değiştirebiliriz, yani üçgenler küçültülebilirler ya da büyütülebilirler. Çizim
    programı “değişikliği geri al” (Undo) şeklinde bir menüye sahiptir. Bu menü üzerinden üçgenler
    üzerinde yaptığımız her türlü değişikliği geri alabilir ve üçgenleri eski hallerine dönüştürebiliriz.
    Yapılan değişiklikleri geri alabilmemiz için değişikliği yapmadan önce üçgen nesnelerinin son
    durumlarını saklamamız gerekmektedir. Memento tasarım şablonunu kullanarak nesnenin sahip
    olduğu son durumu kaydedip, gerekli durumlarda nesneyi eski haline dönüştürebiliriz.

    Memento tasarım şablonu ne zaman kullanılır?
    Bir nesnenin sahip olduğu son durumu saklamak için Memento tasarım şablonu kullanılır.

    İlişkili tasarım şablonları
    Komut tasarım şablonu memento nesneleri kullanarak, yapılan işlemlerin tekrar geri alınmasında
    kullanılabilir. Iteratörlerin son durumunu saklamak için Memento nesneleri kullanılabilir.
    */
    public static void main(String[] args) {
        Client client = new Client();
        client.startOperation();
    }
}
