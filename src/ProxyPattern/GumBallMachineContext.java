package ProxyPattern;

public class GumBallMachineContext {
    private State hasQuarter;
    private State noQuarter ;
    private State soldOut;
    private State sold;

    public void setCounter() {
        this.counter --;
    }

    private int counter;
    private State currentState ;

    public State getNoQuarter() {
        return noQuarter;
    }

    public State getSoldOut() {
        return soldOut;
    }

    public State getSold() {
        return sold;
    }

    public int getCounter() {
        return counter;
    }

    public State getCurrentState() {
        return currentState;
    }

    public GumBallMachineContext(int counter) {
        this.hasQuarter =new HasQuarterState(this);
        this.noQuarter = new NoQuarterState(this);
        this.soldOut = new SoldOutState(this);
        this.sold = new SoldState(this);
        this.counter = counter;
        if(counter>0) currentState = noQuarter;
        else currentState = soldOut ;
    }
    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
    currentState.ejectQuarter();
    }

    public void turnCrank() {
    currentState.turnCrank();
    }

    public void dispense() {
    currentState.dispense();
    }
    public void setCurrentState(State state){
        this.currentState = state;
    }

    public State getHasQuarter() {
        return hasQuarter;
    }
}
