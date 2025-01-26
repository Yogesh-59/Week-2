package VehicleRentalSystem;

class Car extends Vehicle implements Insurable{
    private String model;
    private String insurancePolicy;

    public Car(String vehicleNumber, String model, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
        this.model = model;
        this.insurancePolicy = "CAR-" + vehicleNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.8;
    }

    @Override
    public double calculateInsurance() {
        return 999.99; // Fixed insurance cost
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: Policy " + insurancePolicy;
    }
}
