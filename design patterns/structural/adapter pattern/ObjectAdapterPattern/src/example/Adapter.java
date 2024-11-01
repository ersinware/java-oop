package example;

public class Adapter implements IBank {
    private final New_Bank_A new_bank_a;

    public Adapter(New_Bank_A new_bank_a) {
        this.new_bank_a = new_bank_a;
    }

    @Override
    public void addCustomer(Customer c, int limit) {
        new_bank_a.newCustomer(c, limit);
    }

    @Override
    public int learnLimit(int tc) {
        for (Customer c : new_bank_a.customers.keySet())
            if (c.getTC() == tc)
                return new_bank_a.checkLimit(c.getFullname());

        throw new RuntimeException("");
    }

    @Override
    public void raiseLimit(int tc, int newLimit) {
        for (Customer customer : new_bank_a.customers.keySet())
            if (customer.getTC() == tc) {
                new_bank_a.changeLimit(customer.getFullname(), newLimit);
                return;
            }

        throw new RuntimeException("");
    }
}