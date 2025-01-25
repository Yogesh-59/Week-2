package ECommercePlatform;
import java.util.ArrayList;
import java.util.List;

public class E_CommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Electronics EC = new Electronics("ARY981", "UNDER-WEAR", 750, "JOCKEY");
        products.add(EC);
        Clothing ct = new Clothing("DUR381", "LAPTOP", 1550, "XL");
        products.add(ct);
        Groceries gc = new Groceries("DEEP149", "BMW-M5", 44854754.89, "Dairy");
        products.add(gc);

        for (Product product : products) {
            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice();

            // Calculate tax for Taxable products
            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                double tax = taxableProduct.calculateTax();
                finalPrice += tax;
                System.out.println(taxableProduct.getTaxDetails());
            }

            finalPrice -= discount;
            System.out.println("Name of the product Product: " + product.getName());
            System.out.println("Original Price: " + product.getPrice());
            System.out.println("Total Discount: " + discount);
            System.out.println("Final Price of product: " + finalPrice);
        }
    }
}
