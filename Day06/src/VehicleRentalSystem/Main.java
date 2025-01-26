package VehicleRentalSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Car car =new Car("MP-15 2005","BMW-M5", 1555000.00);
        vehicles.add(car);
        Bike bike =new Bike("MP-15 2505","BMW S-1000RR", 175000.00);
        vehicles.add(bike);
        Truck truck =new Truck("MP-15 1111",750.90, 257500.00);
        vehicles.add(truck);
        // Polymorphic processing
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle.getType());
            System.out.println("Rental Cost Per Day: " + vehicle.calculateRentalCost(1));

            // Check for insurance
            if (vehicle instanceof Insurable) {
                Insurable insuredVehicle = (Insurable) vehicle;
                System.out.println(insuredVehicle.getInsuranceDetails());
                System.out.println("Insurance Cost " + insuredVehicle.calculateInsurance());
            }
            System.out.println();
        }
    }
}
