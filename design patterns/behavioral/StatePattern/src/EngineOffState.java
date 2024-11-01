public class EngineOffState implements State {
    @Override
    public void start(Engine engine) {
        engine.setState(engine.getEngineOnState());
        System.out.println("the engine is started");
    }

    @Override
    public void stop(Engine engine) {
        System.out.println("already the engine is off");
    }
}
