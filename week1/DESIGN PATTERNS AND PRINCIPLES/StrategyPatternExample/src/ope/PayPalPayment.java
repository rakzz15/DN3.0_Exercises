package ope;

public class PayPalPayment implements PaymentStrategy{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal.");
        // Implementing PayPal payment process
        System.out.println("Payment completed with PayPal.");
    }

}
