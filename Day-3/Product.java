public class Product {
    // Instance variables
    // tatic variable to hold the discount percentage shared by all 
    private static double discount = 0.0;
    private final String productID; // Final variable for unique identifier
    private String productName;
    private double price;
    private int quantity;

    // constructor
    public Product(String productName, String productID, double price, int quantity) {
        this.productID = productID; // Initialize final variable
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
        } else {
           System.out.println("discount must be between 0 and 100.");
        }
    }
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static double getDiscount() {
        return discount;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }

    // Method to calculate the price after discount
    public double calculateDiscountedPrice() {
        return price - (price * discount / 100);
    }
    void displayResult(){
       System.out.println("The name of product is :"+productName);
       System.out.println("product Id :"+productID);
      System.out.println("The price of product is :"+price);
      System.out.println("quantity of product :"+quantity);
    }
    // Main method to test the functionality
    public static void main(String[] args) {
        // Create a new product
        Product product1 = new Product("BMW-M5", "BMW-25052005", 30530950.970, 7);
         if (product1 instanceof Product) {
            System.out.println("product1 is an instance of Product");
        }
        else{
            System.out.println("product1 is not an instance of Product");
        }

        //display product details
        product1.displayResult();

        // Update the discount percentage
        Product.updateDiscount(10.9);

        // display discounted price
        System.out.println("Discounted Price: " + product1.calculateDiscountedPrice());

    }
}
