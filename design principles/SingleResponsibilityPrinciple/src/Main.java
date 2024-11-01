public class Main {
    public static void main(String[] args) {
        /*
        Customer  sınıfını  test  edilebilir  ve  bakımı  kolay  bir  hale  getirmek  için  sahip  olduğu sorumlulukların  başka  sınıflara  yüklenmesi  gerekmektedir
        Customer sınıfı içerisinde login(), sendEmail() gibi metodları barındırmamalı
        Bir  sınıfın  sorumluluğunu  sadece  bir  sebepten  dolayı  değişebilir  olması  olarak  tanımlayabiliriz.
        Eğer bir sınıfın değişikliğe uğraması için birden fazla sebep varsa, bu sınıf birden fazla sorumluluk taşıyor demektir.
        Bu durumda sınıfta sadece bir sorumluluk kalacak şekilde sorumlukların diğer sınıflarla paylaşılması yoluna gidilmelidir.
         */

        Customer customer = new Customer("Ersin", "Karaer", 20);
        LoginService loginService = new LoginServiceImpl();
        EmailService emailService = new EmailServiceImpl();
        loginService.login(customer);
        emailService.sendEmail(customer);
    }
}
