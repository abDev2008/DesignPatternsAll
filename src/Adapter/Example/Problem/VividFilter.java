package Adapter.Example.Problem;

public class VividFilter implements  Filter{
    @Override
    public void apply(Image image) {
        System.out.println("applying vivid filter");
    }
}
