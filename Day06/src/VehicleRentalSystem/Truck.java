package VehicleRentalSystem;

class Truck extends Vehicle {
    private double capacity;

    public Truck(String vehicleNumber, double capacity, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
        this.capacity = capacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.7;
    }
}
