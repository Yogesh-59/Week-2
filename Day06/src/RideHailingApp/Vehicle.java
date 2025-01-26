package RideHailingApp;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Concrete method to get vehicle details
    public String getVehicleDetails() {
        return "ID of vehicle: " + vehicleId + ", Driver name is: " + driverName;
    }

    // Getters
    public String getVehicleId() {
        return vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
}
