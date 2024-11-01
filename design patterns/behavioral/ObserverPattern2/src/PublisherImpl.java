import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements Publisher {
    private List<Subscriber> listSubscriber = new ArrayList<>();

    @Override
    public List<Subscriber> getListSubscriber() {
        return listSubscriber;
    }

    private Journal journal;

    public PublisherImpl(Journal journal) {
        this.journal = journal;
    }

    @Override
    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    @Override
    public String getJournalName() {
        return journal.getJournalName();
    }


    @Override
    public void addSubscriber(Subscriber subscriber) {
        listSubscriber.add(subscriber);
        subscriber.onSubscribe(this);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        listSubscriber.remove(subscriber);
        subscriber.onUnsubscribe(this);
    }

    @Override
    public void sendJournal() {
        for (Subscriber subscriber : listSubscriber) subscriber.buyJournal(journal);
    }
}
