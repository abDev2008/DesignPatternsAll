package StrategyPattern.Exercises.Solution.Strategies;

import StrategyPattern.Exercises.Solution.FilterStrategy;

public class Filter2 implements FilterStrategy {
    @Override
    public void filter(String fileName) {
        System.out.println("Implementing filter 2, to file " + fileName);
    }
}
