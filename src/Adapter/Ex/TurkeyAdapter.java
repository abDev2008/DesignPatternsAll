package Adapter.Ex;

public class TurkeyAdapter implements Duck{
    private Turky turky;

    public TurkeyAdapter(Turky turky) {
        this.turky = turky;
    }

    @Override
    public void quack() {
        turky.gobble();
    }

    @Override
    public void fly() {
    turky.fly();
    }
}
