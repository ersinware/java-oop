import Implementations.Producer;

public abstract class Product {
    private Producer producer;

    public Product(Producer producer) {
        this.producer = producer;
    }

    public abstract void produce();

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}
