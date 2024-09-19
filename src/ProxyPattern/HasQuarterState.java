package ProxyPattern;

import java.util.Random;

public class HasQuarterState implements State{
    GumBallMachineContext gumBallMachineContext;

    public HasQuarterState(GumBallMachineContext gumBallMachineContext) {
        this.gumBallMachineContext = gumBallMachineContext;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you have already inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
    gumBallMachineContext.setCurrentState(gumBallMachineContext.getNoQuarter());
        System.out.println("your quarter is coming out");
    }

    @Override
    public void turnCrank() {
    gumBallMachineContext.setCurrentState(gumBallMachineContext.getSold());
    dispense();
    }

    @Override
    public void dispense() {
    int res = gumBallMachineContext.getCounter();
//        Random r = new Random();
//        int randomNumber = r.nextInt(2) + 1;
        if(res -1>0){
            gumBallMachineContext.setCurrentState(gumBallMachineContext.getNoQuarter());
        }
        else{
            gumBallMachineContext.setCurrentState(gumBallMachineContext.getSoldOut());
        }

    }
}
