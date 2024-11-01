import java.util.List;

public class Memento {
    private CloneableArrayList<String> listLines = new CloneableArrayList<>();

    public Memento(CloneableArrayList<String> listLines) {
        this.listLines = listLines;
    }

    public CloneableArrayList<String> getListLines() {
        return listLines;
    }
}
