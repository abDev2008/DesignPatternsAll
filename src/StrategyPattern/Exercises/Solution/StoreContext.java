package StrategyPattern.Exercises.Solution;

public class StoreContext {
    private CompressorStrategy compressorStrategy;
    private FilterStrategy filterStrategy;
    public StoreContext(CompressorStrategy compressorStrategy, FilterStrategy filterStrategy) {
        this.compressorStrategy = compressorStrategy;
        this.filterStrategy = filterStrategy;
    }

    public void store(String fileName){
    compressorStrategy.compress(fileName);
    filterStrategy.filter(fileName);
        System.out.println(fileName+ " file stored.");
    }
}
