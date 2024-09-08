package StrategyPattern.Solutions.SortingStrategy.Solution;

import java.util.List;

public interface SortingStrategy {
    void sort(List<Integer> list,String algorithm);
}
