import java.util.Scanner;
public class ProductDetailsModule {
    public void displayProducts(int categoryNumber) {
        System.out.print("Enter a product (1-" + ((categoryNumber == 1) ? "3" : "1") + "): ");
        int productNumber = new Scanner(System.in).nextInt();

        switch (categoryNumber) {
            case 1:
                if (productNumber == 1) {
                    System.out.println("You have selected Rice - Rs. 50");
                } else if (productNumber == 2) {
                    System.out.println("You have selected Wheat - Rs. 40");
                } else if (productNumber == 3) {
                    System.out.println("You have selected Sugar - Rs. 30");
                } else {
                    System.out.println("Invalid product number.");
                }
                break;
            case 2:
                if (productNumber == 1) {
                    System.out.println("You have selected Potato - Rs. 20");
                } else if (productNumber == 2) {
                    System.out.println("You have selected Onion - Rs. 30");
                } else if (productNumber == 3) {
                    System.out.println("You have selected Tomato - Rs. 40");
                } else {
                    System.out.println("Invalid product number.");
                }
                break;
            case 3:
                if (productNumber == 1) {
                    System.out.println("You have selected Apple - Rs. 50");
                } else if (productNumber == 2) {
                    System.out.println("You have selected Banana - Rs. 100");
                } else if (productNumber == 3) {
                    System.out.println("You have selected Orange - Rs. 150");
                } else {
                    System.out.println("Invalid product number.");
                }
                break;
            default:
                System.out.println("Invalid category number.");
        }
    }
}
