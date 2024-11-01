import MyComponent.ComponentFacade;
import MyComponent.FacadeFactory;

public class Main {
    /*
    FacadeFactory sınıfının görevi, komponenti kullanan sınıf için bir ComponentFacade nesnesi oluşturmaktır.
    Bunu gerçekleştirebilmek için component içinde ComponentFacade interface sınıfını implemente eden sınıfların bulunması gerekmektedir.

    Avantajları :
    Komponenti kullanan sınıf (Main sınıfı) komponentin sunduğu hizmeti ComponentFacade
    interface sınıfında tanımlanmış metotlar üzerinden alır. Kullanıcı sınıfın tanıması gereken
    sadece ComponentFacade ve FacadeFactory sınıflarıdır.

    Komponent, bünyesinde barındırdığı sınıfları kullanıcı sınıf kodunun tekrar derlenmesine gerek
    kalmadan değiştirebilir. Komponent ile kullanıcı sınıf arasındaki tek bağ, ComponentFacade
    interface sınıfından tanımlanmış olan metotlardır ve bu metotlar değişmediği sürece, kullanıcı
    sınıf komponent içinde yapılan değişikliklerden etkilenmez.

    Komponent, bünyesinde barındırdığı ve sunduğu hizmeti implemente eden sınıfları dış
    dünyadan saklar. Örneğin komponent içinde yer alan MyClass sınıfını kullanıcı sınıf (Main)
    kesinlikle tanımaz ve new MyClass() şeklinde kullanamaz. Eğer Main sınıfı MyClass sınıfını
    doğrudan kullanabilseydi, bu Main sınıfı ve komponent arasında sıkı bir bağ oluşturur ve
    komponentin yapısı değiştirildiğinde, Main sınıfını da negatif etkilerdi.

    Komponent çeşitli ComponentFacade implemenstasyon sınıfları (örneğin FacadeImpl) sunarak,
    verdiği hizmetin değişik yöntemlerle ve kullanıcı sınıfın ihtiyaçları doğrultusunda
    oluşturulmasını sağlıyabilir. Bu gibi değişikliklerden kullanıcı sınıf etkilenmez.

    Cephe tasarım şablonu ne zaman kullanılır?
    Kullanıcı sınıf ve sistemin parçalarını oluşturan altsistemler (subsystem) ya da komponentler
    arasındaki bağ, cephe tasarım şablonu ile esnek bir yapıda oluşturulur. Altsistemlerde oluşan
    değişikliklerden kullanıcı sınıflar etkilenmez. Komponent ve altsistem tasarımlarında cephe tasarım
    şablonu kullanılmalıdır.
    Refactoring yöntemiyle mevcut kod, altsistem ya da komponent olarak yeniden düzenlenmelidir.
    Bu sayede görevi ve sunduğu hizmet tanımlanmış ve bakımı kolay komponentler oluşur. Bu
    komponentlerin yapılandırılmalarında cephe tasarım şablonu kullanılmalıdır.

    İlişkili tasarım şablonları
    Facade yerine abstract factory kullanılarak sistem içinde kullanılan nesnelerin oluşumu ve
    kullanımı saklı tutulabilir. Facade ile yeni bir interface tanımlanırken, adaptör tasarım şablonu ile
    mevcut bir interface sınıf kullanılır. Facade sınıfları singleton olarak implemente edilebilirler.
     */
    public static void main(String[] args) {
        /*
        Komponentin FacadeFactory ve ComponentFacade dışındaki sınıflarına erişilemez.
        Sıkı bağların kurulması engellenir.
         */
        FacadeFactory facadeFactory = FacadeFactory.getInstance();
        ComponentFacade componentFacade = facadeFactory.getFacade();
        componentFacade.methodOfFacadeImpl();
    }
}
