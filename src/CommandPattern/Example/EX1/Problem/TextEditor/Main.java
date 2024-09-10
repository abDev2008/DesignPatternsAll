package CommandPattern.Example.EX1.Problem.TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.writeText("Hello World");
        textEditor.undo();
    }
}
