package StrategyPattern.Exercises.Solution.Strategies;

import StrategyPattern.Exercises.Solution.CompressorStrategy;

public class Compressor1 implements CompressorStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("compressing using algorithm 1, to file " + fileName);
    }
}
