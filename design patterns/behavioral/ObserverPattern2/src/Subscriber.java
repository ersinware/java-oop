import java.util.List;

public interface Subscriber {
    void buyJournal(Journal journal);

    void subscribe(Publisher publisher);

    void unsubscribe(Publisher publisher);

    List<Publisher> getListPublisher();

    void onSubscribe(Publisher publisher);

    void onUnsubscribe(Publisher publisher);
}
