import Implementations.Producer;

public class Notebook extends Product {
    public Notebook(Producer producer) {
        super(producer);
    }

    @Override
    public void produce() {
        getProducer().produceNotebook();
    }
}
