package RideHailingApp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("CAR1999", "Deepraj Lodhi");
        Bike bike = new Bike("BIKE2000", "Yogesh Thakur");
        Auto auto = new Auto("AUTO2001", "Rajesh");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);
        double distance=16.5;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));

            // Check GPS location
            if (vehicle instanceof GPS) {
                GPS gpsVehicle = (GPS) vehicle;
                gpsVehicle.updateLocation("City Center ");
                System.out.println("Current Location of vehicle is: " + gpsVehicle.getCurrentLocation());
            }
            System.out.println();
        }
    }
}
