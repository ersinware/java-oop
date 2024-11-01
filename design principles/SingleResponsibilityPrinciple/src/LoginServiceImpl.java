public class LoginServiceImpl implements LoginService {
    @Override
    public void login(Customer customer) {
        System.out.println(customer.getName() + " is logined");
    }
}
