import java.util.ArrayList;
import java.util.List;

public class SubscriberImpl implements Subscriber {
    private String name;
    private String surname;

    public SubscriberImpl(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void buyJournal(Journal journal) {
        System.out.println(name + " " + surname + ", bought " + journal.getJournalName());
    }

    @Override
    public void subscribe(Publisher publisher) {
        publisher.addSubscriber(this);
    }

    @Override
    public void unsubscribe(Publisher publisher) {
        publisher.removeSubscriber(this);
    }

    private List<Publisher> listPublishers = new ArrayList<>();

    @Override
    public List<Publisher> getListPublisher() {
        return listPublishers;
    }

    @Override
    public void onSubscribe(Publisher publisher) {
        listPublishers.add(publisher);
        System.out.println(name + " " + surname + ", subscribed to " + publisher.getJournalName());
    }

    @Override
    public void onUnsubscribe(Publisher publisher) {
        listPublishers.remove(publisher);
        System.out.println(name + " " + surname + ", unsubscribed from " + publisher.getJournalName());
    }
}
