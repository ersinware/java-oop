package example;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("name surname", 12345);

        IBank bank = new Adapter(new New_Bank_A());

        bank.addCustomer(customer1, 1000);

    }
}
