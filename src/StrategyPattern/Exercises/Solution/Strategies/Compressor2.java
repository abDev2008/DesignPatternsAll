package StrategyPattern.Exercises.Solution.Strategies;

import StrategyPattern.Exercises.Solution.CompressorStrategy;

public class Compressor2 implements CompressorStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using algorithm 2, to file" + fileName);
    }
}
