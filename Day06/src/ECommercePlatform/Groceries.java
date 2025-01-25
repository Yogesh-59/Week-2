package ECommercePlatform;

 class Groceries extends Product  {
     private String category;

     public Groceries(String productId, String name, double price, String category) {
         super(productId, name, price);
         this.category = category;
     }

     @Override
     public double calculateDiscount() {
         return price * 0.07; // 5% discount
     }
}
