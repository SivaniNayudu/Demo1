import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the AtoZ online Application.");
    System.out.println("Please spare us your valuable moment to become a member to our AtoZOn App:)");

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your mobile number: ");
    String mobileNumber = scanner.nextLine();

    while (mobileNumber.length() < UserRegistrationModule.MIN_MOBILE_NUMBER_LENGTH || mobileNumber.length() > UserRegistrationModule.MAX_MOBILE_NUMBER_LENGTH) {
        System.out.println("Invalid mobile number. Please enter a 10-digit mobile number.");
        System.out.print("Enter your mobile number: ");
        mobileNumber = scanner.nextLine();
    }

    System.out.print("Enter your address: ");
    String address = scanner.nextLine();

    System.out.print("Enter your pin number: ");
    String pinNumber = scanner.nextLine();

    while (pinNumber.length() != UserRegistrationModule.PIN_NUMBER_LENGTH) {
        System.out.println("Invalid pin number. Please enter a 6-digit pin number.");
        System.out.print("Enter your pin number: ");
        pinNumber = scanner.nextLine();
    }

    System.out.print("Enter your email: ");
    String email = scanner.nextLine();

    if (!email.contains("@") || !email.contains(".") || email.indexOf("@") > email.indexOf(".")) {
        System.out.println("Invalid email. Please enter a valid email.");
        return;
    }

    // Create a RegistrationModule object to register the user
    UserRegistrationModule registrationModule = new UserRegistrationModule(name, mobileNumber, address, pinNumber, email);

    System.out.println("The following categories are available:");
    System.out.println("1. Grocery ");
    System.out.println("2. Stationary");
    System.out.println("3. Vegetables");
    System.out.println("4. Fruits");
    System.out.println("5. Toys");
    System.out.println("The following items are available in the 1.Grocery category:");
    System.out.println("1. Rice - Rs. 50/kg");
    System.out.println("2. Wheat - Rs. 40/kg");
    System.out.println("3. Sugar - Rs. 30/kg");
    System.out.println("The following items are available in the 2.Stationary category:");
    System.out.println("1. Notebook - Rs. 10");
    System.out.println("2. Pen - Rs. 5");
    System.out.println("3. Pencil - Rs. 3");
    System.out.println("The following items are available in the 3.Vegetables category:");
    System.out.println("1. Potato - Rs. 20/kg");
    System.out.println("2. Onion - Rs. 30/kg");
    System.out.println("3. Tomato - Rs. 40/kg");
    System.out.println("The following items are available in the 4.Fruits category:");
    System.out.println("1. Apple - Rs. 50/kg");
    System.out.println("2. Banana - Rs. 30/kg");
    System.out.println("3. Orange - Rs. 40/kg");
    System.out.println("The following items are available in the 5.Toys category:");
    System.out.println("1. Car - Rs. 100");
    System.out.println("2. Doll - Rs. 150");
    System.out.println("3. Teddy Bear - Rs. 200");

    System.out.print("Enter a category (1-5): ");
    int categoryNumber = scanner.nextInt();

    // Create a ProductDetailsModule object and call its methods to display the product details
    ProductDetailsModule productModule = new ProductDetailsModule();
    productModule.displayProducts(categoryNumber);

    System.out.print("Enter a product (1-3): ");
    int productNumber = scanner.nextInt();

    System.out.println("Select a payment method (1. Cash on Delivery, 2. GPay, 3. Paytm): ");
    int paymentMethod = scanner.nextInt();

    BillingModule billingModule = new BillingModule();
    billingModule.processPayment(categoryNumber, productNumber, registrationModule.getRegistrationNumber(), paymentMethod == 2 ? "GPay" : (paymentMethod == 3 ? "Paytm" : "Cash on Delivery"));

    scanner.close();
}
}