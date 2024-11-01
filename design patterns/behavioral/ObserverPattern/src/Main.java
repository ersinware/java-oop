public class Main {
    /*
    Bir gazeteye günlük abone olmak istediğimizi düşünelim. Abone olduğumuz günden itibaren gazete
    her gün evimize posta aracılığıyla gönderilir. Burada gazete ile aboneleri arasında doğrudan bir
    ilişki oluşmaktadır. Hergün yeni bir baskı yapıldığı zaman aboneler otomatik olarak gazete
    tarafından bilgilendirilir. Bu bilgilendirme işlemi, gazetenin aboneye posta ile gönderilmesi
    anlamına gelmektedir. Abone olduğumuz sürece her gün gazete bize gönderilir. İstediğimiz bir
    zaman gazeteye haber vererek, aboneliğimizi iptal eirebiliriz. Abonelik sona erdikten sonra bize
    posta ile gazete gönderilmez. Gözetleyici tasarım şablonu bir abonelik sistemi gibi çalışmaktadır

    Sistem bünyesinde, bir nesnede meydana gelen değişikliklerden haberdar olmak isteyen diğer
    nesneler olabilir. Bu durumda haberdar olmak isteyen nesneler abone olarak, abone oldukları
    nesnede meydana gelen değişikliklerden haberdar edilirler. Abone olan nesne aboneliğini iptal
    ederek, abone olduğu nesne ile arasındaki ilişkiyi sonlandırabilir

    JDK bünyesinde de gözetleyici tasarım şablonu bulunmaktadır. Kendi Observer interface sınıflarını
    yazmadan, JDK API den bulunan java.util.Observer ve java.util.Observable sınıflarını
    kullanabiliriz.

    Gözetleyici tasarım şablonu ne zaman kullanılır?
    Bir nesne üzerinde yapılan değişiklik başka nesnelerin de değiştirilmesini zorunlu kılıyorsa ve kaç
    nesnenin değiştirilmesi gerektiğini bilmiyorsak, gözetleyici tasarım şablonun kullanarak nesneler
    üzerinde gerekli değişiklikleri uygulayabiliriz.

    İlişkili tasarım şablonları
    Adaptör tasarım şablonu kullanılarak, abone olmak isteyen nesneler belirli bir Abone interface
    sınıfını implemente etmek zorunda kalmadan abone olabilirler. Gözetleyici tasarım şablonu
    mediator tasarım şablonunu kullanarak, nesneler arası iletişimi koordine edebilir
     */
    public static void main(String[] args) {
        ObservedObject observedObject = new ObservedObjectImpl();

        ObserverI observer1 = new ObserverImpl();
        ObserverI observer2 = new ObserverImpl();
        ObserverI observer3 = new ObserverImpl();

        observedObject.registerObserver(observer1);
        observedObject.registerObserver(observer2);
        observedObject.registerObserver(observer3);

        observedObject.notifyObservers();

        System.out.println("");

        observedObject.removeObserver(observer3);

        observedObject.notifyObservers();
    }
}
