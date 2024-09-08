package StrategyPattern.Solutions.SortingStrategy.Solution.Algorithms;

import StrategyPattern.Solutions.SortingStrategy.Solution.SortingStrategy;

import java.util.List;

public class Quick implements SortingStrategy {
    @Override
    public void sort(List<Integer> list, String algorithm) {
        System.out.println("Sorting " + algorithm + " with " + list.size() + " elements");
    }
}
