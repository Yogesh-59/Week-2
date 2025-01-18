public class VehicleRegistration {

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // create one Class variable they shared among all objects
    private static double registrationFee = 500.0; 

    // Constructor to initialize instance variables
    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    //copy constructor
    VehicleRegistration(VehicleRegistration vehicle){
       this.ownerName = vehicle.ownerName;
        this.vehicleType = vehicle.vehicleType;
   }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Vehicle owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // make one class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        // Create VehicleRegistration objects
        VehicleRegistration vehicle =new VehicleRegistration("Yogesh", "Bike");
        //call parameterized constructor
        vehicle.displayVehicleDetails();
        //update the resistration fee
        VehicleRegistration.updateRegistrationFee(2500.50);
        VehicleRegistration vehicle1= new VehicleRegistration(vehicle);
        //make object of copy constructor and call
        vehicle1.ownerName="Deepraj";
        vehicle1.vehicleType="Car";
        vehicle1.displayVehicleDetails();
    }
}