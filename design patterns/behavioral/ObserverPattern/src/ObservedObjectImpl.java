import java.util.ArrayList;
import java.util.List;

public class ObservedObjectImpl implements ObservedObject {
    List<ObserverI> listObservers = new ArrayList<>();

    @Override
    public void registerObserver(ObserverI observer) {
        listObservers.add(observer);
    }

    @Override
    public void removeObserver(ObserverI observer) {
        listObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverI observer : listObservers) observer.update();
    }
}
