package StrategyPattern.Solutions.Payment;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;
    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void processPayment(double amount){
        paymentStrategy.pay(amount);
    }
}
