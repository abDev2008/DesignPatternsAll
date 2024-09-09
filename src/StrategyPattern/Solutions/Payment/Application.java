package StrategyPattern.Solutions.Payment;

import StrategyPattern.Solutions.Payment.Strategies.CashStrategy;
import StrategyPattern.Solutions.Payment.Strategies.MobilePaymentStrategy;

public class Application {
    public static void main(String[] args) {
        MobilePaymentStrategy mobilePaymentStrategy = new MobilePaymentStrategy();
        PaymentProcessorContext paymentProcessorConcrete = new PaymentProcessorContext(mobilePaymentStrategy);
        paymentProcessorConcrete.processPayment(5000);

        PaymentStrategy cashPaymentStrategy = new CashStrategy();
        cashPaymentStrategy.pay(3000);
    }
}
