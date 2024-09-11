package Adapter.Ex;

public class Application {
    public static void main(String[] args) {
        Turky myTurky = new Turky();
        Duck d = new TurkeyAdapter(myTurky);
        d.fly();
        d.quack();
        MallurdDuck mallurdDuck = new MallurdDuck();
        mallurdDuck.fly();
        mallurdDuck.quack();
    }
}
