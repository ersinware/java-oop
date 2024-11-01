package Implementations;

import Factories.GreenFactory;

public class GreenProducer implements Producer {
    private GreenFactory greenFactory = new GreenFactory();

    @Override
    public void producePencil() {
        greenFactory.produceGreenPencil();
    }

    @Override
    public void produceNotebook() {
        greenFactory.produceGreenNotebook();
    }
}
