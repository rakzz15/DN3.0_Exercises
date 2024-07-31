package ope;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card.");
        // Implementing credit card payment process
        System.out.println("Payment completed with Credit Card.");
    }

}
