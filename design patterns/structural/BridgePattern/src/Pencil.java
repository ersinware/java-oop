import Implementations.Producer;

public class Pencil extends Product {
    public Pencil(Producer producer) {
        super(producer);
    }

    @Override
    public void produce() {
        getProducer().producePencil();
    }
}
