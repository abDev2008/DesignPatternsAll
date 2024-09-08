package StrategyPattern.Solutions.Payment;

public class MobilePayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Mobile payment...."+amount);
    }
}
