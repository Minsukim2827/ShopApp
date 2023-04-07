package min_Su_Kim_22185126_AssignmentA;

public class OnlineShop {
	// Private instance variables
    private Product[] inventory;
    private int nProduct;
    // Constructor that initializes the inventory array with a length of 5(0-4 index)
    // and sets the number of products to 0
    public OnlineShop() {
        inventory = new Product[5];
        nProduct = 0;
    }
    
    // Method which adds a product to the inventory array
    public void add(Product product) {
    	// Checks if there is space in the inventory array, in this case checks if 5 slots arn't taken
        if (nProduct < inventory.length) {
            inventory[nProduct] = product;
            nProduct++;
        } 
        // Print error message if array is full
        else {
            System.out.println("Inventory is full. Cannot add product.");
        }
    }
    // Generates a string representation of the inventory: Loops through each index of the inventory
    // and returns a description of each product
    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < nProduct; i++) {
            output += (i+1) + ".\n" + inventory[i].toString() + "\n\n";
        }
        return output;
    }
    // Method to get a product from the inventory array by its index (must be a value
    // between 1 and inventory length)
    public Product getProduct(int index) {
        if (index < 1 || index > 5) {
            return null;
        }
        return inventory[index-1];
    }
}
