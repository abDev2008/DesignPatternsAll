package StatePattern;

public class SoldState implements State{
    GumBallMachineContext gumBallMachineContext;

    public SoldState(GumBallMachineContext gumBallMachineContext) {
        this.gumBallMachineContext = gumBallMachineContext;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Already processing your first input");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you have already used your chance");
    }

    @Override
    public void turnCrank() {
        System.out.println("Already processing your first input");
    }

    @Override
    public void dispense() {
    throw new IllegalStateException("SoldState has already been dispensed");
    }
}
