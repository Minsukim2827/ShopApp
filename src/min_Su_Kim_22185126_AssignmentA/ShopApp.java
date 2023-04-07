package min_Su_Kim_22185126_AssignmentA;
import java.util.Scanner;

public class ShopApp {
    private static OnlineShop shop;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[]args){
    	// Create a new instance of OnlineShop
    	shop = new OnlineShop();
    	Scanner scans = new Scanner(System.in);	
    	
    	// Add five initial products to the inventory
        shop.add(new Product("Ryzen 5 5600X", "AMD", 191.48));
        shop.add(new Product("Ryzen 7 5800X", "AMD", 248.99));
        shop.add(new Product("Core i9-13900K", "Intel", 569.99));
        shop.add(new Product("Core i5-13600K", "Intel", 319.82));
        shop.add(new Product("Core i7-13700K", "Intel", 417.92));

        while (true) {
        	// Display option menu and ask for an input
            System.out.println("Select an option:\nA. Display inventory\nB. Rate product\nC. Exit");
            String input = scans.nextLine().trim().toUpperCase(); //Allows the input to contain whitespace and is not case sensitive   
            
            // Option A. Displays inventory
            if (input.equals("A")) {
                System.out.println(shop.toString());
            } 
            // Option B. Calls the rateProduct method
            else if (input.equals("B")) {
            	rateProduct(scan);
            } 
            // Option C. Exits Program
            else if (input.equals("C")) {
            	System.out.println("Thank you for visiting OnlineShop! Please come again!");
            	break;
            	
            } 
            // Print Error message if input is not A a, B b, or C c(note i made input Case insensitive)
            else if (!input.equals("A") || !input.equals("B") || !input.equals("C")) {
            	System.out.println("Invalid option! Please try again");
            }
    }
}
    private static void rateProduct(Scanner scan) {	  	
        // Print the inventory and ask for the product number
        System.out.println(shop.toString() + "\nPlease enter the number of the product you would like to rate (1-5):");
        int productNumber = scan.nextInt();

        // Validate the product number
        while (productNumber < 1 || productNumber > 5)
        {
            System.out.println("Invalid product number. Please try again.\n");
            System.out.println(shop.toString() + "\nPlease enter the number of the product you would like to rate (1-5):");
            productNumber = scan.nextInt();
        }
        
        // Get the selected product and print its details
        Product product = shop.getProduct(productNumber);
        System.out.println("Selected product: " + productNumber + ".\n" + product.toString() + "\nPlease enter a rating for the product (0.0-5.0):");
        double rating = scan.nextDouble();
        
        // Loops this section if rating is not between 0.0 and 5.0
        while(rating < 0.0 || rating > 5.0) {
        	System.out.println("Invalid rating. Please try again.\n");
        	System.out.println("Selected product: " + productNumber + ".\n" + product.toString() + "\nPlease enter a rating for the product (0.0-5.0):");
        	rating = scan.nextDouble();
        }
        // Updates and prints the product rating
        product.rateReliability(rating);
        System.out.println("Updated product:\n" + product.toString() + "\n");         
    }  	
}
