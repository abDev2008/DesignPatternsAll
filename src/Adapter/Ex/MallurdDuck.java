package Adapter.Ex;

public class MallurdDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Mallurd Duck Quack");
    }

    @Override
    public void fly() {
        System.out.println("Mallurd Duck Fly");
    }
}
