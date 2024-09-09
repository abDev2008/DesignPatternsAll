package StrategyPattern.Solutions.Payment;

public class PaymentProcessorContext {
    private PaymentStrategy paymentStrategy;
    public PaymentProcessorContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double payment) {
        paymentStrategy.pay(payment);
    }
}
