public class Main {

    /*
    Fabrika metodu tasarım şablonu ne zaman kullanılır?
    Kullanıcı  sınıf  hangi  alt sınıfların  kullanılması  gerektiğini  bilmiyorsa;
    Örneğin  Main sınıfı Pdf ya da Work döküman tiplerini tanımıyor.
    Kullanıcı sınıf alt sınıflardan nasıl nesne üretilmesi gerektiğini bilmiyorsa.
    Kullanıcı sınıf ihtiyaç duyulan nesnelerin oluşturulmasını alt sınıflara delege etmek istiyorsa.

    İlişkili tasarım şablonları
    Builder, prototype, abstract factory ve factory tasarım şablonları fabrika metodu tasarım şablonu
    ile benzerlik gösterirler ve yeni nesne oluşturmak için kullanılırlar.
     */

    public static void main (String[] args) {
        Document document = DocumentFactory.createDocument("PDF");
        System.out.println(document.getType());

        Document document2 = DocumentFactory.createDocument("WORD");
        System.out.println(document2.getType());
    }
}
