public class CloseCommand implements Command {
    private Television tv;

    public CloseCommand(Television tv) {
        this.tv = tv;
    }

    public Television getTv() {
        return tv;
    }

    public void setTv(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.close();
    }
}
