package Hybrid_Inheritance;

interface Refuelable {
    void refuel();
}

 class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " is charging. Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelTankSize;

    public PetrolVehicle(String model, int maxSpeed, double fuelTankSize) {
        super(model, maxSpeed);
        this.fuelTankSize = fuelTankSize;
    }

    @Override
    public void refuel() {
        System.out.println(model + " refueled. Fuel Tank Size: " + fuelTankSize + " liters");
    }
}
  public class VehicleManagement{

    public static void main(String[] args) {
        ElectricVehicle tata = new ElectricVehicle("TATA EV", 250, 100);
        PetrolVehicle bmw = new PetrolVehicle("BMW-M5", 399, 60);

        tata.charge();
        bmw.refuel();
    }
}