package StrategyPattern.Assignment.Solution.Strategy;

public class CheckingAccountStrategy implements InterestCalculationStrategy{
    @Override
    public double calculateInterest(double balance) {
       if(balance<100){
           return balance*0.015;
       } else {
           return balance*0.025;
       }
    }
}
