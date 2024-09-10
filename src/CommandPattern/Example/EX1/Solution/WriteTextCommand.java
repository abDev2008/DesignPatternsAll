package CommandPattern.Example.EX1.Solution;



public class WriteTextCommand implements Command{
    private TextEditor1 editor;
    private String text;

    public WriteTextCommand(TextEditor1 editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.writeText(text);
    }

    @Override
    public void undo() {
    editor.undo();
    }
}
