public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(Customer customer) {
        System.out.println("Mail is sent to " + customer.getName());
    }
}
