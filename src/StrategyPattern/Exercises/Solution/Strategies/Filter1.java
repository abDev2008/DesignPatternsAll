package StrategyPattern.Exercises.Solution.Strategies;

import StrategyPattern.Exercises.Solution.FilterStrategy;

public class Filter1 implements FilterStrategy {
    @Override
    public void filter(String fileName) {
        System.out.println("Implementing filter 1, to file " + fileName);
    }
}
