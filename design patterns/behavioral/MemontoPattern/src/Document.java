public class Document {
    private CloneableArrayList<String> listLines = new CloneableArrayList();

    public void setListLines(CloneableArrayList<String> listLines) {
        this.listLines = listLines;
    }

    public void addLine(int index, String line) {
        listLines.add(index, line);
    }

    public void removeLine(int index) {
        listLines.remove(index);
    }

    public void removeLine(String line) {
        listLines.remove(line);
    }

    public Memento createMemento() {
        return new Memento((CloneableArrayList<String>) this.listLines.clone());
    }

    public void changeDocument(Memento memento) {
        listLines = memento.getListLines();
    }

    @Override
    public String toString() {
        StringBuilder allLines = new StringBuilder();
        for (String line : listLines) allLines.append(line).append("\n");
        return allLines.toString();
    }
}
