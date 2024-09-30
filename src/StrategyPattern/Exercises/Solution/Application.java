package StrategyPattern.Exercises.Solution;

import StrategyPattern.Exercises.Solution.Strategies.Compressor1;
import StrategyPattern.Exercises.Solution.Strategies.Filter1;

public class Application {
    public static void main(String[] args) {
        FilterStrategy filter1 = new Filter1();
        CompressorStrategy compressor1 = new Compressor1();
        StoreContext store = new StoreContext(compressor1,filter1);
        store.store("something");

    }
}
