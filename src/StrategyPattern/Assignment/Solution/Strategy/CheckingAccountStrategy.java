package StrategyPattern.Assignment.Solution.Strategy;

public class CheckingAccountStrategy implements InterestCalculationStrategy{
    @Override
    public double calculateInterest(double balance) {
        System.out.println("calculating interest }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}");
       if(balance<100){
           return (balance*0.015)+2000;
       } else {
           return (balance*0.025)+2000;
       }
    }
}
