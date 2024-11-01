public class Main {
    /*
    Nesne havuzu tasarım şablonu ne zaman kullanılır?
    Sistem kaynaklarının kontrollü bir şekilde kullanılması gerektiğinde.
    Kullanılan nesne adedine sınırlama getirilmek istendiğinde.
    Nesne edinme süreci hızlandırılmak istendiğinde.

    İlişkili tasarım şablonları
    Havuzu gerekli nesnelerle doldurmak için prototip tasarım şablonu kullanılabilir.
    Factory method tasarım şablonu ile nesnelerin oluşturulma işlemi havuz ve havuzdan
    nesne edinme kodundan ayrıştırılabilir.
    Havuzun kendisi singleton tasarım şablonu ile implemente edilir

    Nesnelerin bulunduğu havuzu bir bellek olarak düşünebiliriz.
    Uygulama çalışmaya başladığı andan itibaren, örneğin fabrika ya da fabrika metodu
    yöntemiyle gerekli nesneleri oluşturarak, havuz doldurulabilir.
    */
    public static void main(String[] args) throws DataSource.NoConnectionsInPool {
        Connection c1 = DataSource.getConnection();
        System.out.println(c1);
        Connection c2 = DataSource.getConnection();
        System.out.println(c2);
        Connection c3 = DataSource.getConnection();
        System.out.println(c3);

        DataSource.release(c1);
        Connection c4 = DataSource.getConnection();
        System.out.println(c4);
    }
}
