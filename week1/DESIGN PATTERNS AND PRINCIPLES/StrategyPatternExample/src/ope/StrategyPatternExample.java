package ope;

public class StrategyPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        PaymentContext paymentContext = new PaymentContext(creditCardPayment);

        System.out.println("Processing payment with Credit Card:");
        paymentContext.executePayment(150.00);

        // Changing the strategy at runtime
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com");
        paymentContext.setPaymentStrategy(payPalPayment);
        System.out.println("\nProcessing payment with PayPal:");
        paymentContext.executePayment(250.00);



	}

}
