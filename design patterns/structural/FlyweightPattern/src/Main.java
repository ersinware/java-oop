public class Main {
    /*
    Nesneye yönelik programlama dillerinde sınıflar ve bu sınıflardan oluşturulan nesneler kullanır.
    Bazen aynı sınıftan yüzlerce, belki binlerce nesne oluşturup, kullanıyor olabiliriz. Bu gibi
    durumlarda çok nesne oluşturulduğu için sistem performansı kötüye gidebilir. Sinek siklet tasarım
    şablonu kullanılarak, kullanılan nesne adedini aşağıya çekebiliriz.

    Sinek siklet tasarım şablonu ne zaman kullanılır?
    Uygulama için kullanılan nesne adedini önemli ölçüde düşürmek için sinek siklet tasarım şablonu
    kullanılır. Nesne adedinin düşmesi ile performans iyileşir ve daha az hafıza alanı kullanılır.

    İlişkili tasarım şablonları
    Durum (state) ve strateji (strategy) tasarım şablonlarında kullanılan nesnelerin sinek siklet olarak
    implemente edilmelerinde fayda vardır. Bu şekilde bu tür nesnelerin ortak kullanımı mümkün hale
    gelir.
     */

    public static void main(String[] args) {
        String firstLine = "Nesneye yönelik programlama dillerinde sınıflar ve bu sınıflardan oluşturulan nesneler kullanır.";
        String secondLine = "Bazen aynı sınıftan yüzlerce, belki binlerce nesne oluşturup, kullanıyor olabiliriz. Bu gibi durumlarda çok nesne oluşturulduğu için sistem performansı kötüye gidebilir.";
        String thirdLine = "Sinek siklet tasarım şablonu kullanılarak, kullanılan nesne adedini aşağıya çekebiliriz.";

        LetterManager.addLine(firstLine);
        LetterManager.addLine(secondLine);
        LetterManager.addLine(thirdLine);

        LetterManager.printDocument();
    }
}
