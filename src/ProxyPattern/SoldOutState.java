package ProxyPattern;

public class SoldOutState implements State{
    GumBallMachineContext gumBallMachineContext;

    public SoldOutState(GumBallMachineContext gumBallMachineContext) {
        this.gumBallMachineContext = gumBallMachineContext;
    }
    @Override
    public void insertQuarter() {
        throw new UnsupportedOperationException("out of gums, can't insert quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("no coin inserted");

    }

    @Override
    public void turnCrank() {
    throw new UnsupportedOperationException("out of gums, can't turn crank");
    }

    @Override
    public void dispense() {
    throw new UnsupportedOperationException("out of gums, can't dispense");
    }
}
