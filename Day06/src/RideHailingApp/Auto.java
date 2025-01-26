package RideHailingApp;

 class Auto extends Vehicle{
     public Auto(String vehicleId, String driverName) {
         super(vehicleId, driverName, 12);
     }

     @Override
     public double calculateFare(double distance) {
         return distance * ratePerKm;
     }
}
