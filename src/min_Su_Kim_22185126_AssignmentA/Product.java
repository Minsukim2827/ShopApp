package min_Su_Kim_22185126_AssignmentA;

public class Product {
    //private instance variables
    private String modelName;       // Model name of the product
    private String manuName;    // Manufacturer's name of the product
    private double retailPrice;     // Retail price of the product
    private double reliability;     // Reliability rating of the product (0.0 to 5.0)
    private int numOfRatings;       // Number of consumers who rated the product
    
    // Constructor method that takes model name, manufacturer name, and retail price as input
    // and sets reliability and numOfRatings to default values
    public Product(String modelName, String manuName, double retailPrice) {
        this.modelName = modelName;
        this.manuName = manuName;
        this.retailPrice = retailPrice;
        this.reliability = 0.0;     // Default value for reliability
        this.numOfRatings = 0;       // Default value for number of ratings
    }

    // Constructor method that takes model name and manufacturer name as input and sets
    //retailPrice, reliability and numOfRatings to default
    public Product(String modelName, String manuName) {
        this.modelName = modelName;
        this.manuName = manuName;
        this.retailPrice = 0.0;      // Default value for retail price
        this.reliability = 0.0;     // Default value for reliability
        this.numOfRatings = 0;       // Default value for number of ratings
    }

    // Get and Set method to access each private instance variable
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public String getManuName() {
        return manuName;
    }
    public void setManuName(String manuName) {
        this.manuName = manuName;
    }
    public double getRetailPrice() {
        return retailPrice;
    }
    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
    public double getReliability() {
        return reliability;
    }
    public void setReliability(double reliability) {
        this.reliability = reliability;
    }
    public int getNumOfRatings() {
        return numOfRatings;
    }
    public void setNumOfRatings(int numOfRatings) {
        this.numOfRatings = numOfRatings;
    }
    
    // Overridden toString() method that returns a useful description of the product
    @Override
    public String toString() {
        return "Product Name: " + modelName + "\nManufacturer: " + manuName + "\nRetail Price: $" + retailPrice +
         "\nReliability Rating: " + reliability + "/5.0 (based on " + numOfRatings + " Customer Ratings)";
    }
    
    // Method to update the reliability rating using a double value as a parameter in its formula
    public void rateReliability(double customerRating) {
        double oldReliability = reliability;
        int oldNumOfRatings = numOfRatings;
        
        reliability = (oldReliability * oldNumOfRatings + customerRating) / (oldNumOfRatings + 1);
        //add 1 to counter as each customer rating increases total ratings by 1
        numOfRatings++;
    }
}

