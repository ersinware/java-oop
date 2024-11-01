public interface Car {

    public void startEngine();

    public void stopEngine();

    /*
    interface'ler new anahtar sözcüğü ile oluşturulamaz!
    interface de interface implemente edebililr
    interface metodlarının gövdesi olamaz, soyutturlar
    bu interface'i implemente eden sınıf, interface'in tüm metodlarını override etmek zorundadır

    Java interface sınıflarının kullanıcı sınıflar için bir nevi sözleşme metni oluşturduğunu gördük.
    Bir interface  sadece  dış  dünyaya  sunulacak  hizmetleri  tanımlar.
    Bu  hizmetlerin  nasıl  yerine getirileceğine interface sınıfını implemente eden alt sınıflar karar verir.
    Interface kullanıcısı genelde hangi altsınıf üzerinden gereken hizmeti aldığını bilmez, bilmek zorunda değildir.
    Bu sayede "loose coupling“  olarak  tabir  edilen,  servis  sağlayıcı  ve  kullanıcı  arasında  gevşek  bir  bağımlılık oluşturulmuş  olur.
    Bu  yazılım  mimarisi  açısından  büyük  bir  avantaj  sağlamaktadır.
    Interface sınıflar kullanılarak, sisteme esnek ve ilerde servis kullanıcılarını etkilemeden eklemeler yapılabilir.
    Firma  aracı  örneğine  dönecek  olursak : Firmanın  Volvo marka arabası bulunmaktadır.
    Kısa  bir  zaman  sonra  Fiat  marka  bir  araç  daha  satın  alınır.
    Burada  yapılması gereken sadece Fiat isminde bir sınıf oluşturup, Car interface'ini implemente etmektir.
    Bu şekilde sistemi,  diğer  bölümleri  etkilemeden  genişletmiş  oluyoruz.
    Sürücüler (ehliyet almış sürücüler!) sadece  Car  interface'ini tanıdıklarından, onlara firma tarafından hangi aracın verildiği önemli değildir.
    Kısaca  interface  sınıflar  servis  kullanıcılarından  karmaşık  yapıdaki  alt sınıfları  gizli  tutmak  ve servis sunucusu ve sağlayıcı arasındaki bağımlılığı
    azaltmak için kullanılırlar.
    Bir çok tasarım şablonunda interface sınıflar büyük rol oynamaktadır.
     */
}
