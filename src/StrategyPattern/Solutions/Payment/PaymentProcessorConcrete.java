package StrategyPattern.Solutions.Payment;

public class PaymentProcessorConcrete {
    private PaymentStrategy paymentStrategy;
    public PaymentProcessorConcrete(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double payment) {
        paymentStrategy.pay(payment);
    }
}
