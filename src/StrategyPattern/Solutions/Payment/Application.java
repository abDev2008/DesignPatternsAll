package StrategyPattern.Solutions.Payment;

import StrategyPattern.Proplems.PaymentProcessor;
import StrategyPattern.Solutions.Payment.Strategies.CashStrategy;
import StrategyPattern.Solutions.Payment.Strategies.CreditCardPaymentStrategy;
import StrategyPattern.Solutions.Payment.Strategies.MobilePaymentStrategy;

public class Application {
    public static void main(String[] args) {
        MobilePaymentStrategy mobilePaymentStrategy = new MobilePaymentStrategy();
        PaymentProcessorConcrete paymentProcessorConcrete = new PaymentProcessorConcrete(mobilePaymentStrategy);
        paymentProcessorConcrete.processPayment(5000);

        PaymentStrategy cashPaymentStrategy = new CashStrategy();
        cashPaymentStrategy.pay(3000);
    }
}
