package StrategyPattern.Solutions.SortingStrategy.Problem;

import java.util.List;

public class Sorter {
    public void sort(List<Integer> list, String algorithm) {
        if (algorithm.equals("quickSort")) {
            System.out.println("QuickSort");
        } else if (algorithm.equals("mergeSort")) {
            System.out.println("Merge Sort");
        }
    }
}
