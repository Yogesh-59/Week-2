import java.util.ArrayList;
import java.util.List;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity (optional, if you need to modify quantity after creation)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate total price of the item
    public double getTotalPrice() {
        return price * quantity;
    }

    // Display item details
    public void displayItem() {
        System.out.printf("Item: %s, Price: $%.2f, Quantity: %d, Total: $%.2f%n", itemName, price, quantity, getTotalPrice());
    }
}

class ShoppingCart {
    private List<CartItem> cartItems;

    // Constructor
    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.setQuantity(item.getQuantity() + quantity); 
                System.out.println("Updated quantity for " + itemName);
                return; 
            }
        }
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println("Added " + itemName + " to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        cartItems.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
        System.out.println("Removed " + itemName + " from the cart.");
    }

    // Method to calculate the total cost
    public double getTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalPrice();
        }
        return totalCost;
    }

    // Method to display all items in the cart
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("Shopping Cart:");
        for (CartItem item : cartItems) {
            item.displayItem();
        }
        System.out.printf("Total Cost: $%.2f%n", getTotalCost());
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItem("Apple", 1.5, 4);
        cart.addItem("Banana", 0.75, 6);
        cart.addItem("Orange", 2.0, 3);

        // Display cart contents
        cart.displayCart();

        // Remove an item
        cart.removeItem("Banana");

        // Add more quantity of an existing item
        cart.addItem("Apple", 1.5, 2); 

        // Display updated cart contents
        cart.displayCart();
    }
}