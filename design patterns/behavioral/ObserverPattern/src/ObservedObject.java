public interface ObservedObject {
    void registerObserver(ObserverI observer);

    void removeObserver(ObserverI observer);

    void notifyObservers();
}
