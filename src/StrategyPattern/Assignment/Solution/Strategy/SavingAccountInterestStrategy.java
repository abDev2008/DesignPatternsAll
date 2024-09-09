package StrategyPattern.Assignment.Solution.Strategy;

public class SavingAccountInterestStrategy implements InterestCalculationStrategy{
    @Override
    public double calculateInterest(double balance) {
//        System.out.println("calculating saving Interest Strategy");
        System.out.println("calculating interest }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}");

        if(balance<1000){
            return  (balance * 0.01)+2000;
        }
        else if(balance<5000){
            return (balance * 0.02) + 2000;
        }
        else{
            return (balance * 0.04)+2000;
        }

    }
}
