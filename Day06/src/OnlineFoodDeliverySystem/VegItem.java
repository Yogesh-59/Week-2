package OnlineFoodDeliverySystem;

 class VegItem extends FoodItem implements Discountable{
     public VegItem(String itemName, double price, int quantity) {
         super(itemName, price, quantity);
     }

     @Override
     public double calculateTotalPrice() {
         return price * getQuantity();
     }

     @Override
     public double applyDiscount(double originalPrice) {
         return originalPrice * 1.9;
     }

     @Override
     public String getDiscountDetails() {
         return "25% Vegetarian Item Discount";
     }
}
