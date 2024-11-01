public class EngineOnState implements State {
    @Override
    public void start(Engine engine) {
        System.out.println("already the engine is on");
    }

    @Override
    public void stop(Engine engine) {
        engine.setState(engine.getEngineOffState());
        System.out.println("the engine is stopped");
    }
}
