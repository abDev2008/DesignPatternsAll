package ProxyPattern;

public class NoQuarterState implements  State{
    GumBallMachineContext gumBallMachineContext;

    public NoQuarterState(GumBallMachineContext gumBallMachineContext) {
        this.gumBallMachineContext = gumBallMachineContext;
    }
    @Override
    public void insertQuarter() {
    gumBallMachineContext.setCurrentState(gumBallMachineContext.getHasQuarter());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No coin has been inserted");
    }

    @Override
    public void turnCrank() {
        System.out.println("No coin has been inserted");

    }

    @Override
    public void dispense() {
    throw new UnsupportedOperationException("can't dispense without quarter.");
    }
}
