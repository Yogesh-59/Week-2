public class ProductInventory {

    private String productName;
    private double price;

    private static int totalProducts = 0; 

    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }
  // create the default constructor
    ProductInventory(){
      productName="Maybach GLS 600";
      price=7500000000.987;
      totalProducts=1;
   }
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        ProductInventory pi=new ProductInventory("BMW M5",37500000.879);
        // call parameterized constructor
        pi.displayProductDetails();
       //make object of default constructor and call
        ProductInventory pi1=new ProductInventory();
         pi1.displayProductDetails();

        ProductInventory.displayTotalProducts(); 
    }
}