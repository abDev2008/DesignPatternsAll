package StrategyPattern.Solutions.Payment;

import StrategyPattern.Proplems.PaymentProcessor;
import StrategyPattern.Solutions.Payment.Strategies.CashStrategy;
import StrategyPattern.Solutions.Payment.Strategies.MobilePaymentStrategy;

public class Application {
    public static void main(String[] args) {
        PaymentStrategy paymentProcessor = new CashStrategy();
        paymentProcessor = new MobilePaymentStrategy();
        paymentProcessor.pay(3000);
    }
}
