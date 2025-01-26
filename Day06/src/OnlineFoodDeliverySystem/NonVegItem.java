package OnlineFoodDeliverySystem;

 class NonVegItem extends FoodItem implements Discountable{
     public NonVegItem(String itemName, double price, int quantity) {
         super(itemName, price, quantity);
     }

     @Override
     public double calculateTotalPrice() {
         return price * getQuantity() * 1.2; // 20% additional charge
     }

     @Override
     public double applyDiscount(double originalPrice) {
         return originalPrice * 0.95; // 5% discount
     }

     @Override
     public String getDiscountDetails() {
         return "5% Non-Vegetarian Item Discount";
     }
}
