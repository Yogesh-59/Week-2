package ECommercePlatform;

class Electronics extends Product implements Taxable{
    private String brandName;

    public Electronics(String productId, String name, double price, String brandNmae) {
        super(productId, name, price);
        this.brandName = brandName;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return price * 0.28; // 18% tax
    }

    @Override
    public String getTaxDetails() {
        return "The total Tax in electronics is :28%";
    }
}
