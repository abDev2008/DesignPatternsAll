package StatePattern;

public class Application {
    public static void main(String[] args) {
        GumBallMachineContext gum = new GumBallMachineContext(2);
        State res = gum.getCurrentState();

    }
}
