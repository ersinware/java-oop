package Implementations;

import Factories.RedFactory;

public class RedProducer implements Producer {
    private RedFactory redFactory = new RedFactory();

    @Override
    public void producePencil() {
        redFactory.produceRedPencil();
    }

    @Override
    public void produceNotebook() {
        redFactory.produceRedNotebook();
    }
}
