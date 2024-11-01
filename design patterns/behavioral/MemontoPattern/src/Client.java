public class Client {
    /*
    Client sınıfı (kullanıcı sınıf) Memento nesnesi üzerinde değişiklik yapamaz, yapmamalı
    Ancak Document sınıfı (üzerinde işlem uygulanan sınıf) Memento nesnesi üzerinde değişiklik yapabilmeli
     */
    public void startOperation() {
        Document document = new Document();
        document.addLine(0, "1");
        document.addLine(1, "2");
        document.addLine(2, "3");
        document.addLine(3, "4");
        document.addLine(4, "5");
        System.out.println("the first state of the document : \n" + document.toString());

        // dökümanın ilk durumu kaydediliyor
        Memento memento = document.createMemento();

        // dökümanda değişiklik yapıluyor
        document.removeLine(0);
        document.removeLine(0);
        document.removeLine(0);
        document.addLine(0, "33333333");
        System.out.println("the second state of the document : \n" + document.toString());

        // döküman eski haline dönüştürülüyor
        document.changeDocument(memento);
        System.out.println("the last state of the document : \n" + document.toString());
    }
}