package StrategyPattern.Assignment.Solution.Strategy;

public class SavingAccountInterestStrategy implements InterestCalculationStrategy{
    @Override
    public double calculateInterest(double balance) {
//        System.out.println("calculating saving Interest Strategy");
        if(balance<1000){
            return  balance * 0.01;
        }
        else if(balance<5000){
            return balance * 0.02;
        }
        else{
            return balance * 0.04;
        }

    }
}
