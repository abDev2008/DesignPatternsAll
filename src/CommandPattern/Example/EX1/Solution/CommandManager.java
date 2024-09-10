package CommandPattern.Example.EX1.Solution;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> commandHistory = new ArrayList<>();
    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }
    public void undoLastCommand() {
        if(!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.get(commandHistory.size() - 1);
            lastCommand.undo();
        }
    }
}
