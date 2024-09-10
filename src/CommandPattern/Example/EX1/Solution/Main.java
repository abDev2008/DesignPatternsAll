package CommandPattern.Example.EX1.Solution;

public class Main {
    public static void main(String[] args) {
        TextEditor1 textEditor1 = new TextEditor1();
        Command writeHello = new WriteTextCommand(textEditor1,"hello world");

        CommandManager manager = new CommandManager();
        manager.executeCommand(writeHello);
        manager.executeCommand(writeHello);

    }
}
