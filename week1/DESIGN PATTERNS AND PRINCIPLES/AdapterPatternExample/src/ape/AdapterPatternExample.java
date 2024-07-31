package ape;

public class AdapterPatternExample {
    public static void main(String[] args) {
 
	 // Using GPay through the adapter
    PaymentProcessor gpayProcessor = new GPayAdapter(new GPay());
    gpayProcessor.processPayment("GPay Payment Details");

    // Using PhonePe through the adapter
    PaymentProcessor phonePeProcessor = new PhonePeAdapter(new PhonePe());
    phonePeProcessor.processPayment("PhonePe Payment Details");

}}
