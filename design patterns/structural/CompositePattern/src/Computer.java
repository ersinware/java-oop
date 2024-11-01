import java.util.ArrayList;
import java.util.List;

public class Computer implements Piece {
    private List<Piece> listPiece = new ArrayList<>();

    public void addPiece(Piece piece) {
        listPiece.add(piece);
    }

    public void removePiece(Piece piece) {
        if (listPiece.contains(piece)) listPiece.remove(piece);
    }

    public Piece getPieceAtIndex(int index) throws Exception {
        Piece piece;
        try {
            piece = listPiece.get(index);
        } catch (Exception e) {
            throw new Exception(index + " is not found");
        }
        return piece;
    }

    @Override
    public int getPrice() {
        int price = 0;
        for (Piece piece : listPiece) price += piece.getPrice();
        return price;
    }

    public List<Piece> getListPiece() {
        return listPiece;
    }

    public void setListPiece(List<Piece> listPiece) {
        this.listPiece = listPiece;
    }
}
