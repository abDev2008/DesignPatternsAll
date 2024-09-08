package StrategyPattern.Proplems;

import java.util.List;

public class Sorter {
    public void sort(List<Integer> list, String algorithm){
        if(algorithm.equals("quickSort")){
            System.out.println("performing quick sort");
        }
        else if(algorithm.equals("mergeSort")){
            System.out.println("performing merge sort");
        }
    }
}
