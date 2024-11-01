public class Engine {
    private State engineOffState = new EngineOffState();
    private State engineOnState = new EngineOnState();

    public State getEngineOffState() {
        return engineOffState;
    }

    public State getEngineOnState() {
        return engineOnState;
    }

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Engine() {
        state = engineOffState;
    }

    public void start() {
        state.start(this);
    }

    public void stop() {
        state.stop(this);
    }
}
