public class Main {
    public static void main(String[] args) {
        Journal artJournal = new JournalImpl("Art Journal");

        Subscriber me = new SubscriberImpl("Ersin", "Karaer");
        Subscriber mother = new SubscriberImpl("Öznur", "Karaer");
        Subscriber father = new SubscriberImpl("Hasan", "Karaer");

        Publisher artJournalPublisher = new PublisherImpl(artJournal);
        artJournalPublisher.addSubscriber(me);
        artJournalPublisher.addSubscriber(mother);
        artJournalPublisher.addSubscriber(father);

        System.out.println("");

        Journal scienceJournal = new JournalImpl("Science Journal");

        Publisher scienceJournalPublisher = new PublisherImpl(scienceJournal);
        me.subscribe(scienceJournalPublisher);
        mother.subscribe(scienceJournalPublisher);
        father.subscribe(scienceJournalPublisher);

        System.out.println("");

        me.unsubscribe(artJournalPublisher);
        scienceJournalPublisher.removeSubscriber(me);

        System.out.println("");
        artJournalPublisher.sendJournal();
        System.out.println("");
        scienceJournalPublisher.sendJournal();
    }
}
