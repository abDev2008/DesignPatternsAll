package CommandPattern.Example.EX1.Solution;

public class TextEditor1 {
    public void writeText(String text) {
        System.out.println("Writing text "+text);
    }
    public void undo(){
        System.out.println("Undo last action");
    }
}
