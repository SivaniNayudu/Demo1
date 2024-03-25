import java.util.Scanner;

public class BillingModule {
        public void processPayment(int categoryNumber, int productNumber, int registrationNumber,String paymentMethod) {
        System.out.println("Processing payment for category " + categoryNumber + ", product " + productNumber + ", and registration number " + registrationNumber + ".");

        double price = (categoryNumber == 1) ? 10.0 : (categoryNumber == 2) ? 20.0 : 30.0;

        if ("GPay".equalsIgnoreCase(paymentMethod)) {
            System.out.println("Processing payment through GPay...");
            // Add code here to process payment through GPay
            System.out.println("Payment processed through GPay.");
        } else if ("Paytm".equalsIgnoreCase(paymentMethod)) {
            System.out.println("Processing payment through Paytm...");
            // Add code here to process payment through Paytm
            System.out.println("Payment processed through Paytm.");
        } else if ("Cash on Delivery".equalsIgnoreCase(paymentMethod)) {
            System.out.println("Payment processed as Cash on Delivery.");
        } else {
            System.out.println("Invalid payment method selected.");
        }

        System.out.println("Order placed and payment processed. Your order will be delivered soon.");
    }
}