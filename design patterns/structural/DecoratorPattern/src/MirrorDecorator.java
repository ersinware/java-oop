public abstract class MirrorDecorator implements HouseGood {
    /*
    Soyut sınıflar interface implemente ettiklerinde metodlarını override etmek zorunda kalmazlar
    ancak soyut sınıfı miras alan sınıflar interface'in metodlarını override etmek zorundadır
     */

    /*
    Değişik tipte aynalı ürünleri temsil eden üstsınıf.

    AynaDecorator sınıfını soyut olarak tanımlıyoruz. Amacımız değişik türdeki aynaları üretebilmek
    için esnek bir model oluşturabilmektir. Bugün çerçeveli aynalar üretimi için kullanılan
    programımız, yarın yeni bir altsınıf oluşturularak, başka türde bir aynanın üretimine izin
    verebilecek yapıda olmalıdır. Bu yüzden MirrorDecerator isminde bir soyut sınıf tanımlıyarak,
    gelecekte üretimi yapılacak tüm aynalı ürünler için bir baz oluşturmuş oluyoruz. Çerçeveli
    aynaların üretimi için MirrorWithFrame sınıfını oluşturuyoruz
    */
    private HouseGood mirror = new Mirror();

    public HouseGood getMirror() {
        return mirror;
    }

    public void setMirror(HouseGood mirror) {
        this.mirror = mirror;
    }
}
