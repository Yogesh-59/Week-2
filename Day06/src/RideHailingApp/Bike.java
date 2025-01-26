package RideHailingApp;

class Bike extends Vehicle implements GPS{
    private String currentLocation;

    public Bike(String vehicleId, String driverName) {
        super(vehicleId, driverName, 10);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}
