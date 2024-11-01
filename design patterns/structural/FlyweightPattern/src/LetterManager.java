import java.util.ArrayList;
import java.util.List;

public class LetterManager {
    /*
    Flyweight tasarım şablonunu kullanarak, kullanılan harf nesne adedi
    alfabedeki harf adedine indirilir.
     */

    private LetterManager() {

    }

    private static LetterManager letterManager = new LetterManager();

    public static LetterManager getInstance() {
        return letterManager;
    }

    private List<Letter> listLetters = new ArrayList<>();

    public List<Letter> getListLetters() {
        return listLetters;
    }

    public void setListLetters(List<Letter> listLetters) {
        this.listLetters = listLetters;
    }

    private List<List<Letter>> listLines = new ArrayList<>();

    public List<List<Letter>> getListLines() {
        return listLines;
    }

    public void setListLines(List<List<Letter>> listLines) {
        this.listLines = listLines;
    }

    /*
    Bir harf nesnesi oluşturur. Mevcut harf nesneleri letterList degiskeninde
    tutulur. Bu listede yer almayan harfler new ile oluşturularak listeye
    dahil edilirler.
     */

    public static Letter getLetter(String stringLetter) {
        for (Letter letter : getInstance().getListLetters())
            if (letter.getStringLetter().equals(stringLetter)) return letter;

        // the letter could not find

        Letter newLetter = new Letter(stringLetter);
        getInstance().getListLetters().add(newLetter);
        return newLetter;
    }

    public static void addLine(String line) {
        List<List<Letter>> listLines = getInstance().getListLines();
        List<Letter> listLetters = new ArrayList<>();
        listLines.add(listLetters);

        for (char charLetter : line.toCharArray())
            listLetters.add(getLetter(String.valueOf(charLetter)));
    }

    public static void printDocument() {
        List<List<Letter>> listLines = getInstance().getListLines();
        for (List<Letter> listLetters : listLines) {
            for (Letter letter : listLetters)
                System.out.print(letter.getStringLetter());
            System.out.println("");
        }

        System.out.println("\n" + getInstance().getListLetters().size() + " letter is created in total");
        for (int i = 0; i < listLines.size(); i++)
            System.out.println((i + 1) + ". line has " + listLines.get(i).size() + " letter");
    }
}
