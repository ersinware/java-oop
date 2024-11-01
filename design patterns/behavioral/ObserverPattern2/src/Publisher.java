import java.util.List;

public interface Publisher {
    void setJournal(Journal journal);

    String getJournalName();

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void sendJournal();

    List<Subscriber> getListSubscriber();
}
