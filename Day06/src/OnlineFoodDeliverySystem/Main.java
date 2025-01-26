package OnlineFoodDeliverySystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<FoodItem> orderItems = new ArrayList<>();

        VegItem veg = new VegItem("MATAR PANEER", 150, 1);
        NonVegItem nonVeg = new NonVegItem("Chicken Biryani", 100, 1);

        orderItems.add(veg);
        orderItems.add(nonVeg);

        // Process order with polymorphism

        double totalOrderPrice = 0;

        for (FoodItem item : orderItems) {
            System.out.println(item.getItemDetails());
            double itemTotalPrice = item.calculateTotalPrice();

            // Apply discount if applicable
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                System.out.println(discountableItem.getDiscountDetails());
                itemTotalPrice = discountableItem.applyDiscount(itemTotalPrice);
            }

            System.out.println("Item Total price: " + itemTotalPrice);
            totalOrderPrice += itemTotalPrice;
            System.out.println();
        }

        System.out.println("Order Total: " + totalOrderPrice);
    }
}
