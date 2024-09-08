package StrategyPattern.Solutions.Payment;

public class Application {
    public static void main(String[] args) {
        MobilePayment mobilePayment = new MobilePayment();
        CashPayment cashPayment = new CashPayment();
        PaymentProcessor processor = new PaymentProcessor(mobilePayment);
        processor = new PaymentProcessor(cashPayment);
        processor.processPayment(3000);
    }
}
