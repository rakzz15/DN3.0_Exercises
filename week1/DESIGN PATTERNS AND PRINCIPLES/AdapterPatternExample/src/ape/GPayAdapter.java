package ape;

public class GPayAdapter implements PaymentProcessor{
    private final GPay gPay;

    public GPayAdapter(GPay gPay) {
        this.gPay = gPay;
    }

    //@Override
    public void processPayment(String paymentDetails) {
        gPay.makeGPayPayment(paymentDetails);
    }

}
