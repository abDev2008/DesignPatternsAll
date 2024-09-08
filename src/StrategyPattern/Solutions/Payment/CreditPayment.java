package StrategyPattern.Solutions.Payment;

public class CreditPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("paying with credit card...."+amount);
    }
}
