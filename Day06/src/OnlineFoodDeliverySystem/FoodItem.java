package OnlineFoodDeliverySystem;

abstract class FoodItem {
    private String itemName;
    protected double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Concrete method to get item details
    public String getItemDetails() {
        return itemName + " (Qty: " + quantity + ", Price: " + price + ")";
    }

    // Getters
    public String getItemName() {
        return itemName;
    }
    public int getQuantity() {
        return quantity;
    }
}
