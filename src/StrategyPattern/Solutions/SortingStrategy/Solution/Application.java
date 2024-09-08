package StrategyPattern.Solutions.SortingStrategy.Solution;

import StrategyPattern.Solutions.SortingStrategy.Solution.Algorithms.MergSortAlgorithm;
import StrategyPattern.Solutions.SortingStrategy.Solution.Algorithms.Quick;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
       SortingStrategy sortingStrategy = new MergSortAlgorithm();
       List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

       sortingStrategy.sort(list,"some algorithm");
    }
}
