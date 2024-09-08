package StrategyPattern.Solutions.Payment;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("paying with cash...."+amount);
    }
}
