package VehicleRentalSystem;

class Bike extends Vehicle implements Insurable{
    private String type;
    private String insurancePolicy;

    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
        this.type = type;
        this.insurancePolicy = "BIKE-" + vehicleNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 0.9;
    }

    @Override
    public double calculateInsurance() {
        return 700; // Fixed insurance cost
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: Policy " + insurancePolicy;
    }
}
