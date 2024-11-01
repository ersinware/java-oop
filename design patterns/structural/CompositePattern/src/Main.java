public class Main {
    /*
    Bileşik tasarım şablonu bir sistemin bütünü ve parçaları arasındaki ilişkileri modellemek için
    kullanılmaktadır. Sistemin bütününü oluşturan parçalar, kendi içlerinde alt parçalardan oluşabilir.
    Bileşik tasarım şablonu kullanıcı sınıfın, sistem, sistemin parçaları ve alt parçalar arasında ayrım
    yapmadan nesneleri kullanmasına izin vermektedir. Bu şekilde sistem yazılımı ve kullanımı daha
    sadeleştirilmektedir.

    Kullanıcı sınıf açısından bakıldığında bir bilgisayar ve grafik kartı arasında bir farklılık yoktur, çünkü ikisi de
    Piece interface sınıfını implemente etmektedirler. Böyle bir farkın olmaması, kullanıcı sınıf için
    yazılan kodun daha sade bir hal almasını sağlamaktadır, çünkü kullanıcı sınıf if ve else yapıları ile
    önce önündeki parçanın hangi sınıftan olduğunu tespit etmek zorunda kalmamaktadır.

    Bileşik tasarım şablonu ne zaman kullanılır?
    Bir nesnenin bütünü ve parçaları arasındaki ilişkiyi modellemek için.
    Eğer kullanıcı sınıf için nesnenin parçaları ve kendisi üzerinde yapılan işlemlerin transparen olması isteniyorsa.

    İlişkili tasarım şablonları
    Bileşik tasarım şablonu dekoratör tasarım şablonu ile beraber kullanılabilir. İki tasarım
    şablonunun beraber kullanılabilmesi için her iki tasarım şablonu için kullanılan sınıfların aynı üst
    sınıftan olmaları gerekmektedir. Sadece bu durumda Decorator nesneleri addPiece(), removePiece() ve
    getPieceAtIndex() metotlarına sahip olabilir. Döngücü (iterator) tasarım şablonu kullanılarak, composite
    nesnenin parçaları ve bunların alt parçaları üzerinde işlem yapılabilir. Flyweight tasarım şablonu
    ile nesneler ve sahip oldukları alt parçalar ortak kullanılabilir.
     */
    public static void main(String[] args) {
        // Computer da Piece nesnesi
        Computer computer = new Computer();

        Piece monitor = new Monitor();
        Piece mouse = new Mouse();
        Piece keyboard = new Keyboard();
        Piece ram = new Ram4GB();
        Piece ram2 = new Ram4GB();
        Piece ram3 = new Ram4GB();

        computer.addPiece(monitor);
        computer.addPiece(mouse);
        computer.addPiece(keyboard);
        computer.addPiece(ram);
        computer.addPiece(ram2);
        computer.addPiece(ram3);

        System.out.println("TOTAL : " + computer.getPrice());
    }
}
