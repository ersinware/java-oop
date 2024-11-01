import java.util.ArrayList;

public class CloneableArrayList<E> extends ArrayList<E> implements Cloneable {
    @Override
    public Object clone() {
        return super.clone();
    }
}
