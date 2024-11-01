public class Main {
    /*
    Soyut fabrika tasarım şablonu ne zaman kullanılır?
    Kullanıcı sınıf hangi altsınıfların kullanılması gerektiğini bilmiyorsa.
    Kullanıcı sınıf altsınıflardan nasıl nesne üretilmesi gerektiğini bilmiyorsa.
    Kullanıcı sınıf ihtiyaç duyulan nesnelerin oluşturulmasını altsınıflara delege etmek istiyorsa.
    Kullanıcı sınıf birden fazla nesne ailesi ile beraber çalışmak zorunda ise.

    İlişkili tasarım şablonları
    Soyut  fabrika  yerine  prototip  tasarım  şablonu  kullanılabilir.
    Bunun  yanı  sıra  soyut  fabrika bünyesinde  prototip  yardımıyla  gerçek  nesneler  de  oluşturmak  mümkündür.
    Soyut fabrika sınıflarını fabrika metodu olarak implemente etmek mümkündür.
    Builder tasarım şablonunda nesne adım adım oluşturulup, en son işlem olarak geri verilirken,
    soyut fabrikada nesne oluşturulur ve akabinde geri verilir.
     */

    public static void main(String[] args) {
        AbstractFactory greenFactory = new GreenFactory();
        Apple greenApple = greenFactory.getApple();
        Pepper greenPepper = greenFactory.getPepper();
        System.out.println(greenApple.getType());
        System.out.println(greenPepper.getType());

        AbstractFactory redFactory = new RedFactory();
        Apple redApple = redFactory.getApple();
        Pepper redPepper = redFactory.getPepper();
        System.out.println(redApple.getType());
        System.out.println(redPepper.getType());
    }
}
