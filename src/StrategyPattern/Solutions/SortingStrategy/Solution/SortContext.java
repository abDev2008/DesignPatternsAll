package StrategyPattern.Solutions.SortingStrategy.Solution;

import java.util.List;

public class SortContext {
    private SortingStrategy sortingStrategy;
    void SortContext(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(List<Integer> list, String algorithm){
        sortingStrategy.sort(list,algorithm);
    }
}
