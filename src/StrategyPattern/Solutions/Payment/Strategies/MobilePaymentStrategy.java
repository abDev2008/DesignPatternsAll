package StrategyPattern.Solutions.Payment.Strategies;

import StrategyPattern.Solutions.Payment.PaymentStrategy;

public class MobilePaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("You have paid " + amount + " mobile payment");
    }
}
