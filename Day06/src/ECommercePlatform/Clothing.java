package ECommercePlatform;

 class Clothing extends Product implements Taxable {
     private String clothSize;

     public Clothing(String productId, String name, double price, String clothSize) {
         super(productId, name, price);
         this.clothSize = clothSize;
     }

     @Override
     public double calculateDiscount() {
         return price * 0.30; // 15% discount
     }

     @Override
     public double calculateTax() {
         return price * 0.18; // 12% tax
     }

     @Override
     public String getTaxDetails() {
         return "Total GST for Clothing: 18%";
     }
}
