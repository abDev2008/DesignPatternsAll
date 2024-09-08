package StrategyPattern.Proplems;

public class PaymentProcessor {
    public void processPayment(String type,double amount){
        if(type.equals("cash")){
            System.out.println("processing cash");
        }
        else if(type.equals("creditCard")){
            System.out.println("processing credit card");
        }
        else if(type.equals("debitCard")){
            System.out.println("processing debit card");
        }
        else if(type.equals("mobile")){
            System.out.println("processing mobile");
        }
    }
}
