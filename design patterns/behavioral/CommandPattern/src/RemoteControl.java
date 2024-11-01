import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    public static final int COMMAND_OPEN = 0;
    public static final int COMMAND_CLOSE = 1;
    private List<Command> listCommands = new ArrayList<>();

    public RemoteControl() {
        Television tv = new Television();
        listCommands.add(new OpenCommand(tv));
        listCommands.add(new CloseCommand(tv));
    }

    public void execute(int commandPosition) {
        if (commandPosition < 0 || commandPosition > listCommands.size() - 1)
            throw new RuntimeException("invalid command position : " + commandPosition);

        listCommands.get(commandPosition).execute();
    }
}
