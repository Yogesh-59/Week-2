package RideHailingApp;

 class Car extends Vehicle implements GPS{
     private String currentLocation;

     public Car(String vehicleId, String driverName) {
         super(vehicleId, driverName, 15); // 15 per km
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
