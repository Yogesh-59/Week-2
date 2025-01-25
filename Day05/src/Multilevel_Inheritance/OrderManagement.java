package Multilevel_Inheritance;

// Base class
class Order {
    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

// Subclass of Order
class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); 
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

// Subclass of ShippedOrder
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
}
public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order("ORD-6-6", "24-01-2025");
        System.out.println(order.getOrderStatus());

        ShippedOrder shippedOrder = new ShippedOrder("ORD-05-25", "26-01-2025", "Track2005");
        System.out.println(shippedOrder.getOrderStatus()); 

        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD@@2005", "20-01-2025", "TRACK456", "30-01-2025");
        System.out.println(deliveredOrder.getOrderStatus()); 
    }
}
