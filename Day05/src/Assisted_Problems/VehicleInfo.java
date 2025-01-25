package Assisted_Problems;
 class Vehicle{
    protected double maxSpeed;
    protected String fuelType;

    public Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Vehicle Details:");
        System.out.println("Max Speed of vehicle : " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    private int seatCapacity;
    private String model;

    public Car(double maxSpeed, String fuelType, int seatCapacity, String model) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
        this.model = model;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Car");
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("Model of car is: " + model);
    }
}

class Truck extends Vehicle {
    private double truckCapacity;
    private String truckType;

    public Truck(double maxSpeed, String fuelType, double truckCapacity, String truckType) {
        super(maxSpeed, fuelType);
        this.truckCapacity = truckCapacity;
        this.truckType = truckType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Truck");
        System.out.println("Truck Capacity: " + truckCapacity + " tons");
        System.out.println("Truck Type: " + truckType);
    }
}

class Motorcycle extends Vehicle {
    private String nameOfbike;

    public Motorcycle(double maxSpeed, String fuelType, String nameOfbike) {
        super(maxSpeed, fuelType);
        this.nameOfbike = nameOfbike;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle");
        System.out.println("Bike name is : " + nameOfbike);
    }
  }
  public class VehicleInfo{

    public static void main(String[] args) {
        Car car =new Car(410.5,"Diesel",7,"Mercedes-Benz Maybach GLS 600");
          car.displayInfo();
       Truck truck =new Truck(150.5,"Diesel",650,"Loading Truck");
          truck.displayInfo();
      Motorcycle motorcycle =new Motorcycle(349.5,"Petrol","BMW S-1000RR");
          motorcycle.displayInfo();
    }
}

